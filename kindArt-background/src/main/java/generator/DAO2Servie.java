package generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.channels.FileChannel;
import java.util.Date;

public class DAO2Servie {

	public static String daoPathConfig = "com/kindArt/manager/dao";

	public static String templatePathConfig = "generator/template";

	public static String domainPathConfig = "com/kindArt/manager/domain";

	public static String servicePathConfig = "com/kindArt/manager/service";

	public static String serviceImplPathConfig = "com/kindArt/manager/service/impl";

	public static String controllerPathConfig = "com/kindArt/manager/controller";

	public static String gPath = "F:/test/";

	public static String daoSuffix = "Mapper";

	public static String daoPath = Thread.currentThread()
			.getContextClassLoader().getResource(daoPathConfig).getPath();

	public static String templatePath = Thread.currentThread()
			.getContextClassLoader().getResource("").getPath()
			+ templatePathConfig;

	public static void analyze(File daoFile) {

		String className = daoFile.getName().replace(".class", "");
		// 类全路径
		String classDriver = (daoPathConfig + "/" + className)
				.replace("/", ".");
		// 需要生成的类的核心名
		String coreClassName = className.replace(daoSuffix, "");

		// 开始读取模板
		try {
			File templateDir = new File(templatePath);
			if (templateDir.exists()) {
				File[] templateFiles = templateDir.listFiles();
				for (int i = 0; i < templateFiles.length; i++) {
					File tempFile = templateFiles[i];
					String target = "";
					if (tempFile.getName().toLowerCase().indexOf("controller") > -1) {
						target = controllerPathConfig + "/"
								+ tempFile.getName().replace(".class", "");
					} else if (tempFile.getName().toLowerCase()
							.indexOf("serviceimpl") > -1) {
						target = serviceImplPathConfig + "/"
								+ tempFile.getName().replace(".class", "");
					} else if (tempFile.getName().toLowerCase()
							.indexOf("service") > -1) {
						target = servicePathConfig + "/"
								+ tempFile.getName().replace(".class", "");
					}
					target = target.replace("#classname#", coreClassName)
							.replace(".txt", "");
					target = gPath + target + ".java";
					File targetFile = new File(target);

					// 判断目录不存在，建立目录
					File servicePathConfigFile = new File(gPath
							+ servicePathConfig);
					File serviceImplPathConfigFile = new File(gPath
							+ serviceImplPathConfig);
					File controllerPathConfigFile = new File(gPath
							+ controllerPathConfig);
					if (!servicePathConfigFile.exists()) {
						servicePathConfigFile.mkdirs();
					}
					if (!serviceImplPathConfigFile.exists()) {
						serviceImplPathConfigFile.mkdirs();
					}
					if (!controllerPathConfigFile.exists()) {
						controllerPathConfigFile.mkdirs();
					}
					// copy文件
					forCopyReplace(tempFile, targetFile,coreClassName);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void forTransfer(File f1, File f2) {
		// 当前时间
		long time = System.currentTimeMillis();
		// 长度2M
		int length = 2097152;
		// 初始化流对象
		FileInputStream in;
		FileOutputStream out;
		// 初始化管道对象
		FileChannel inC;
		FileChannel outC;
		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
			inC = in.getChannel();
			outC = out.getChannel();
			while (true) {
				if (inC.position() == inC.size()) {
					// 读取完毕关闭管道
					outC.close();
					inC.close();
					// 关闭流
					out.close();
					in.close();
					// 打印执行时间
					System.out.println(new Date().getTime() - time);
					break;
				}
				// 计算长度
				if ((inC.size() - inC.position()) < 20971520) {
					length = (int) (inC.size() - inC.position());
				} else {
					length = 20971520;
				}
				// copy
				inC.transferTo(inC.position(), length, outC);
				// 移动指针
				inC.position(inC.position() + length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void forCopyReplace(File orgin, File target,String coreClassName) {
		// 初始化流对象
		Writer fw = null;
		Reader fr = null;
		BufferedReader br = null;
		try {
			fw = new FileWriter(target);
			fr = new FileReader(orgin);
			br = new BufferedReader(fr);
			String temp = null;
			while ((temp = br.readLine()) != null) {
				temp = temp.replace("#classname#",coreClassName);
				temp = temp.replace("#classnameSL#", captureName(coreClassName));
				fw.write(temp);
				fw.write(System.getProperty("line.separator"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static String captureName(String name) {
		name = name.substring(0, 1).toLowerCase() + name.substring(1);
		return name;

	}

	public static void main(String[] args) {

		File daoDir = new File(daoPath);

		File[] daoFiles = daoDir.listFiles();

		for (int i = 0; i < daoFiles.length; i++) {
			analyze(daoFiles[i]);
		}
	}
}
