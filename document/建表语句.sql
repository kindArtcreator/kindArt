-- **************************************************************************
-- * 建库脚本 Table(用户基本信息表)                                         *
-- *------------------------------------------------------------------------*
-- * 用户基本信息表表名  USER_BASE_INFO                                     *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS USER_BASE_INFO;
CREATE TABLE USER_BASE_INFO(
  user_no                            VARCHAR(36)                   NOT NULL Comment '用户编号',
  head_sculpture                     VARCHAR(36) Comment '头像（附件ID）',
  my_nickname                        VARCHAR(100) Comment '我的昵称',
  my_phone                           VARCHAR(11) Comment '我的手机号',
  commended_num                      INT Comment '被赞数',
  fans_num                           INT Comment '粉丝数',
  follow_num                         INT Comment '关注数',
  my_tag                             VARCHAR(500) Comment '自评标签',
  my_position                        VARCHAR(500) Comment '地理位置',
  sex                                VARCHAR(1) Comment '性别',
  birthday                           VARCHAR(8) Comment '生日',
  my_address                         VARCHAR(300) Comment '常住地址',
  signature                         VARCHAR(300) Comment '签名',
  shared_num                         INT Comment '被分享数',
  share_num                          INT Comment '分享数',
  wechat_num                         VARCHAR(20) Comment '微信号',
  qq_num                             VARCHAR(20) Comment 'QQ号',
  blog_num                           VARCHAR(20) Comment '微博号',
  register_time                      DATETIME Comment '注册时间',
  CONSTRAINT USER_BASE_INFO_PK
  PRIMARY KEY(user_no)
);


-- **************************************************************************
-- * 建库脚本 Table(用户扩展信息表)                                         *
-- *------------------------------------------------------------------------*
-- * 用户扩展信息表表名  USER_EXT_INFO                                      *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS USER_EXT_INFO;
CREATE TABLE USER_EXT_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  user_no                            VARCHAR(36) Comment '用户编号',
  type                               VARCHAR(1) Comment '类型',
  related_user_no                    VARCHAR(36) Comment '关联用户编号',
  CONSTRAINT USER_EXT_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(动态基本信息表)                                         *
-- *------------------------------------------------------------------------*
-- * 动态基本信息表表名  DYNAMIC_BASE_INFO                                  *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS DYNAMIC_BASE_INFO;
CREATE TABLE DYNAMIC_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  title                              VARCHAR(90) Comment '标题',
  comment                            VARCHAR(6000) Comment '内容',
  commended_num                      INT Comment '点赞数',
  collection_num                     INT Comment '收藏数',
  publisher_no                       VARCHAR(36) Comment '发布人ID',
  publisher_time                     DATETIME Comment '发布时间',
  dynamic_status                     VARCHAR(1) Comment '动态状态',
  shared_num                         INT Comment '被分享数',
  CONSTRAINT DYNAMIC_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(用户扩展信息表)                                         *
-- *------------------------------------------------------------------------*
-- * 用户扩展信息表表名  DYNAMIC_EXT_INFO                                   *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS DYNAMIC_EXT_INFO;
CREATE TABLE DYNAMIC_EXT_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  dynamic_no                         VARCHAR(36) Comment '动态ID',
  type                               VARCHAR(1) Comment '类型',
  related_user_id                    VARCHAR(36) Comment '关联用户ID',
  CONSTRAINT DYNAMIC_EXT_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(消息评论表)                                             *
-- *------------------------------------------------------------------------*
-- * 消息评论表表名  MES_COM_INFO                                           *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS MES_COM_INFO;
CREATE TABLE MES_COM_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  message_parent_no                  VARCHAR(36) Comment '消息父ID',
  message_comment                    VARCHAR(3000) Comment '消息内容',
  message_publisher_no               VARCHAR(36) Comment '消息发布人ID',
  message_publisher_time             DATETIME Comment '消息发布时间',
  message_way                        VARCHAR(1) Comment '消息方式',
  CONSTRAINT MES_COM_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(动态-消息关系表)                                        *
-- *------------------------------------------------------------------------*
-- * 动态-消息关系表表名  MES_COM_EXT                                       *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS MES_COM_EXT;
CREATE TABLE MES_COM_EXT(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  message_uuid                       VARCHAR(36) Comment '消息主键',
  related_uuid                       VARCHAR(36) Comment '关联主键',
  related_type                       VARCHAR(1) Comment '关联类型',
  CONSTRAINT MES_COM_EXT_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(附件基本信息表)                                         *
-- *------------------------------------------------------------------------*
-- * 附件基本信息表表名  ATT_BASE_INFO                                      *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS ATT_BASE_INFO;
CREATE TABLE ATT_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  att_address                        VARCHAR(200) Comment '附件地址',
  att_name                           VARCHAR(300) Comment '附件名称',
  att_type                           VARCHAR(2) Comment '附件类型',
  att_size                           VARCHAR(20) Comment '附件大小',
  att_classification                 VARCHAR(1) Comment '附件类别',
  CONSTRAINT ATT_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(业务与附件关系表)                                       *
-- *------------------------------------------------------------------------*
-- * 业务与附件关系表表名  BUS_ATT_INFO                                     *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS BUS_ATT_INFO;
CREATE TABLE BUS_ATT_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  att_id                             VARCHAR(36) Comment '附件ID',
  relation_id                        VARCHAR(36) Comment '关系ID',
  type                               VARCHAR(1) Comment '类型',
  att_seq                            INT Comment '附件序号',
  CONSTRAINT BUS_ATT_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(意见反馈表)                                             *
-- *------------------------------------------------------------------------*
-- * 意见反馈表表名  OPINION_FEEDBACK                                       *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS OPINION_FEEDBACK;
CREATE TABLE OPINION_FEEDBACK(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  opinion_type                       VARCHAR(1) Comment '意见类型',
  opinion_code                       VARCHAR(3) Comment '意见代码',
  opinion_code_comment               VARCHAR(300) Comment '意见代码内容',
  opinion_comment                    VARCHAR(3000) Comment '意见内容',
  att_uuid                           VARCHAR(36) Comment '附件主键',
  feedback_no                        VARCHAR(36) Comment '反馈人编号',
  feedback_time                      DATETIME Comment '反馈时间',
  CONSTRAINT OPINION_FEEDBACK_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(发现发布人基本信息)                                     *
-- *------------------------------------------------------------------------*
-- * 发现发布人基本信息表名  FIND_PUBLISHER_BASE                            *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS FIND_PUBLISHER_BASE;
CREATE TABLE FIND_PUBLISHER_BASE(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  subject_photo_no                   VARCHAR(36) Comment '主题背景图片ID',
  logo_photo_no                      VARCHAR(36) Comment 'logo图片ID',
  publishing_enterprise_name         VARCHAR(300) Comment '发布企业名称',
  publishing_enterprise_sumary       VARCHAR(3000) Comment '发布企业简介',
  maintenance_time                   DATETIME Comment '维护时间',
  CONSTRAINT FIND_PUBLISHER_BASE_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(发现表)                                                 *
-- *------------------------------------------------------------------------*
-- * 发现表表名  FIND_BASE_INFO                                             *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS FIND_BASE_INFO;
CREATE TABLE FIND_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  publisher_no                       VARCHAR(36) Comment '发布人编号',
  publisher_time                     DATETIME Comment '发布时间',
  activity_title                     VARCHAR(300) Comment '活动标题',
  activity_content                   BLOB Comment '活动内容',
  commended_num                      INT Comment '被赞数',
  collection_num                     INT Comment '收藏数',
  follow_num                         INT Comment '评论数',
  share_num                          INT Comment '分享数',
  province                           VARCHAR(30) Comment '省份/直辖市',
  city                               VARCHAR(30) Comment '地级市',
  area                               VARCHAR(30) Comment '县/区',
  village                            VARCHAR(30) Comment '街道/村',
  publish_address                    VARCHAR(300) Comment '发布详细地址',
  CONSTRAINT FIND_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(发现表)                                                 *
-- *------------------------------------------------------------------------*
-- * 发现表表名  FIND_BASE_EXT                                              *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS FIND_BASE_EXT;
CREATE TABLE FIND_BASE_EXT(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  activity_no                        VARCHAR(36) Comment '动态ID',
  type                               VARCHAR(1) Comment '类型',
  relation_user_id                   VARCHAR(36) Comment '关联用户ID',
  CONSTRAINT FIND_BASE_EXT_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(标签表)                                                 *
-- *------------------------------------------------------------------------*
-- * 标签表表名  TAG_BASE_INFO                                              *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS TAG_BASE_INFO;
CREATE TABLE TAG_BASE_INFO(
  tag_no                             VARCHAR(36)                   NOT NULL Comment '标签编号',
  tag_name                           VARCHAR(300) Comment '标签名称',
  tag_type_no                        VARCHAR(36) Comment '标签类别编号',
  tag_type_name                      VARCHAR(300) Comment '标签类别名称',
  CONSTRAINT TAG_BASE_INFO_PK
  PRIMARY KEY(tag_no)
);


-- **************************************************************************
-- * 建库脚本 Table(标签动态关系表)                                         *
-- *------------------------------------------------------------------------*
-- * 标签动态关系表表名  TAG_DYNAMIC_RELATION                               *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS TAG_DYNAMIC_RELATION;
CREATE TABLE TAG_DYNAMIC_RELATION(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  activity_no                        VARCHAR(36) Comment '动态编号',
  tag_no                             VARCHAR(36) Comment '标签编号',
  CONSTRAINT TAG_DYNAMIC_RELATION_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * 建库脚本 Table(字典表)                                                 *
-- *------------------------------------------------------------------------*
-- * 字典表表名  DICTIONARY_BASE_INFO                                       *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE日期: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS DICTIONARY_BASE_INFO;
CREATE TABLE DICTIONARY_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '逻辑主键',
  dict_type_code                     VARCHAR(36) Comment '字典类型代码',
  dict_type_name                     VARCHAR(300) Comment '字典类型名称',
  dict_code                          VARCHAR(36) Comment '字典编码',
  dict_value                         VARCHAR(300) Comment '字典值',
  dict_parent_uuid                   VARCHAR(36) Comment '字典上级主键',
  CONSTRAINT DICTIONARY_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


