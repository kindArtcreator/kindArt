<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<% 
	request.setCharacterEncoding("UTF-8");  
	response.setContentType("text/html; charset=UTF-8");  
	String title = request.getParameter("title");
	String addinfo = request.getParameter("addinfo");
	System.out.println(title);
	
	out.print(title);
	
    //保存路径  
    String savePath = getServletContext().getRealPath("/upload");  
    File saveDir = new File(savePath);  
    // 如果目录不存在，就创建目录  
    if(!saveDir.exists()){  
        saveDir.mkdir();  
    }  
      
    // 创建文件上传核心类  
    DiskFileItemFactory factory = new DiskFileItemFactory();  
    ServletFileUpload sfu = new ServletFileUpload(factory);  
    //设置编码  
    sfu.setHeaderEncoding("UTF-8");  
    // 设置上传的单个文件的最大字节数为2M  
    sfu.setFileSizeMax(1024*1024*2);  
    //设置整个表单的最大字节数为10M  
    sfu.setSizeMax(1024*1024*10);  
    try{  
        // 处理表单请求  
        List<FileItem> itemList = sfu.parseRequest(request);  
        for (FileItem fileItem : itemList) {  
            // 对应表单中的控件的name  
            String fieldName = fileItem.getFieldName();  
            System.out.println("控件名称：" + fieldName);  
            // 如果是普通表单控件  
            if(fileItem.isFormField()){  
                String value = fileItem.getString();  
                //重新编码,解决乱码  
                value = new String(value.getBytes("ISO-8859-1"),"UTF-8");  
                System.out.println("普通内容：" + fieldName + "=" + value);  
            // 上传文件  
            }else{  
                // 获得文件大小  
                Long size = fileItem.getSize();  
                // 获得文件名  
                String fileName = fileItem.getName();  
                System.out.println("文件名："+fileName+"\t大小：" + size + "byte");  
                  
                //设置不允许上传的文件格式  
                if(fileName.endsWith(".exe")){  
                    request.setAttribute("msg", "不允许上传的类型！");  
                }else{  
                    //将文件保存到指定的路径  
                    File file = new File(savePath,fileName);  
                    fileItem.write(file);  
                    request.setAttribute("msg", "上传成功！");  
                }  
            }  
        }  
    }catch(FileSizeLimitExceededException e){  
        request.setAttribute("msg", "文件太大");  
    }catch(FileUploadException e){  
        e.printStackTrace();  
    }catch(Exception e){  
        e.printStackTrace();  
    }  
    //上传完毕后  转发到首页  
    request.getRequestDispatcher("/index.jsp").forward(request, response);  
	
	
%>
</head>
<body>
Hello World : 
</body>
</html>