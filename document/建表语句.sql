-- **************************************************************************
-- * ����ű� Table(�û�������Ϣ��)                                         *
-- *------------------------------------------------------------------------*
-- * �û�������Ϣ�����  USER_BASE_INFO                                     *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS USER_BASE_INFO;
CREATE TABLE USER_BASE_INFO(
  user_no                            VARCHAR(36)                   NOT NULL Comment '�û����',
  head_sculpture                     VARCHAR(36) Comment 'ͷ�񣨸���ID��',
  my_nickname                        VARCHAR(100) Comment '�ҵ��ǳ�',
  my_phone                           VARCHAR(11) Comment '�ҵ��ֻ���',
  commended_num                      INT Comment '������',
  fans_num                           INT Comment '��˿��',
  follow_num                         INT Comment '��ע��',
  my_tag                             VARCHAR(500) Comment '������ǩ',
  my_position                        VARCHAR(500) Comment '����λ��',
  sex                                VARCHAR(1) Comment '�Ա�',
  birthday                           VARCHAR(8) Comment '����',
  my_address                         VARCHAR(300) Comment '��ס��ַ',
  signature                         VARCHAR(300) Comment 'ǩ��',
  shared_num                         INT Comment '��������',
  share_num                          INT Comment '������',
  wechat_num                         VARCHAR(20) Comment '΢�ź�',
  qq_num                             VARCHAR(20) Comment 'QQ��',
  blog_num                           VARCHAR(20) Comment '΢����',
  register_time                      DATETIME Comment 'ע��ʱ��',
  CONSTRAINT USER_BASE_INFO_PK
  PRIMARY KEY(user_no)
);


-- **************************************************************************
-- * ����ű� Table(�û���չ��Ϣ��)                                         *
-- *------------------------------------------------------------------------*
-- * �û���չ��Ϣ�����  USER_EXT_INFO                                      *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS USER_EXT_INFO;
CREATE TABLE USER_EXT_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  user_no                            VARCHAR(36) Comment '�û����',
  type                               VARCHAR(1) Comment '����',
  related_user_no                    VARCHAR(36) Comment '�����û����',
  CONSTRAINT USER_EXT_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(��̬������Ϣ��)                                         *
-- *------------------------------------------------------------------------*
-- * ��̬������Ϣ�����  DYNAMIC_BASE_INFO                                  *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS DYNAMIC_BASE_INFO;
CREATE TABLE DYNAMIC_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  title                              VARCHAR(90) Comment '����',
  comment                            VARCHAR(6000) Comment '����',
  commended_num                      INT Comment '������',
  collection_num                     INT Comment '�ղ���',
  publisher_no                       VARCHAR(36) Comment '������ID',
  publisher_time                     DATETIME Comment '����ʱ��',
  dynamic_status                     VARCHAR(1) Comment '��̬״̬',
  shared_num                         INT Comment '��������',
  CONSTRAINT DYNAMIC_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(�û���չ��Ϣ��)                                         *
-- *------------------------------------------------------------------------*
-- * �û���չ��Ϣ�����  DYNAMIC_EXT_INFO                                   *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS DYNAMIC_EXT_INFO;
CREATE TABLE DYNAMIC_EXT_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  dynamic_no                         VARCHAR(36) Comment '��̬ID',
  type                               VARCHAR(1) Comment '����',
  related_user_id                    VARCHAR(36) Comment '�����û�ID',
  CONSTRAINT DYNAMIC_EXT_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(��Ϣ���۱�)                                             *
-- *------------------------------------------------------------------------*
-- * ��Ϣ���۱����  MES_COM_INFO                                           *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS MES_COM_INFO;
CREATE TABLE MES_COM_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  message_parent_no                  VARCHAR(36) Comment '��Ϣ��ID',
  message_comment                    VARCHAR(3000) Comment '��Ϣ����',
  message_publisher_no               VARCHAR(36) Comment '��Ϣ������ID',
  message_publisher_time             DATETIME Comment '��Ϣ����ʱ��',
  message_way                        VARCHAR(1) Comment '��Ϣ��ʽ',
  CONSTRAINT MES_COM_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(��̬-��Ϣ��ϵ��)                                        *
-- *------------------------------------------------------------------------*
-- * ��̬-��Ϣ��ϵ�����  MES_COM_EXT                                       *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS MES_COM_EXT;
CREATE TABLE MES_COM_EXT(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  message_uuid                       VARCHAR(36) Comment '��Ϣ����',
  related_uuid                       VARCHAR(36) Comment '��������',
  related_type                       VARCHAR(1) Comment '��������',
  CONSTRAINT MES_COM_EXT_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(����������Ϣ��)                                         *
-- *------------------------------------------------------------------------*
-- * ����������Ϣ�����  ATT_BASE_INFO                                      *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS ATT_BASE_INFO;
CREATE TABLE ATT_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  att_address                        VARCHAR(200) Comment '������ַ',
  att_name                           VARCHAR(300) Comment '��������',
  att_type                           VARCHAR(2) Comment '��������',
  att_size                           VARCHAR(20) Comment '������С',
  att_classification                 VARCHAR(1) Comment '�������',
  CONSTRAINT ATT_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(ҵ���븽����ϵ��)                                       *
-- *------------------------------------------------------------------------*
-- * ҵ���븽����ϵ�����  BUS_ATT_INFO                                     *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS BUS_ATT_INFO;
CREATE TABLE BUS_ATT_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  att_id                             VARCHAR(36) Comment '����ID',
  relation_id                        VARCHAR(36) Comment '��ϵID',
  type                               VARCHAR(1) Comment '����',
  att_seq                            INT Comment '�������',
  CONSTRAINT BUS_ATT_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(���������)                                             *
-- *------------------------------------------------------------------------*
-- * ������������  OPINION_FEEDBACK                                       *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS OPINION_FEEDBACK;
CREATE TABLE OPINION_FEEDBACK(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  opinion_type                       VARCHAR(1) Comment '�������',
  opinion_code                       VARCHAR(3) Comment '�������',
  opinion_code_comment               VARCHAR(300) Comment '�����������',
  opinion_comment                    VARCHAR(3000) Comment '�������',
  att_uuid                           VARCHAR(36) Comment '��������',
  feedback_no                        VARCHAR(36) Comment '�����˱��',
  feedback_time                      DATETIME Comment '����ʱ��',
  CONSTRAINT OPINION_FEEDBACK_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(���ַ����˻�����Ϣ)                                     *
-- *------------------------------------------------------------------------*
-- * ���ַ����˻�����Ϣ����  FIND_PUBLISHER_BASE                            *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS FIND_PUBLISHER_BASE;
CREATE TABLE FIND_PUBLISHER_BASE(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  subject_photo_no                   VARCHAR(36) Comment '���ⱳ��ͼƬID',
  logo_photo_no                      VARCHAR(36) Comment 'logoͼƬID',
  publishing_enterprise_name         VARCHAR(300) Comment '������ҵ����',
  publishing_enterprise_sumary       VARCHAR(3000) Comment '������ҵ���',
  maintenance_time                   DATETIME Comment 'ά��ʱ��',
  CONSTRAINT FIND_PUBLISHER_BASE_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(���ֱ�)                                                 *
-- *------------------------------------------------------------------------*
-- * ���ֱ����  FIND_BASE_INFO                                             *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS FIND_BASE_INFO;
CREATE TABLE FIND_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  publisher_no                       VARCHAR(36) Comment '�����˱��',
  publisher_time                     DATETIME Comment '����ʱ��',
  activity_title                     VARCHAR(300) Comment '�����',
  activity_content                   BLOB Comment '�����',
  commended_num                      INT Comment '������',
  collection_num                     INT Comment '�ղ���',
  follow_num                         INT Comment '������',
  share_num                          INT Comment '������',
  province                           VARCHAR(30) Comment 'ʡ��/ֱϽ��',
  city                               VARCHAR(30) Comment '�ؼ���',
  area                               VARCHAR(30) Comment '��/��',
  village                            VARCHAR(30) Comment '�ֵ�/��',
  publish_address                    VARCHAR(300) Comment '������ϸ��ַ',
  CONSTRAINT FIND_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(���ֱ�)                                                 *
-- *------------------------------------------------------------------------*
-- * ���ֱ����  FIND_BASE_EXT                                              *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS FIND_BASE_EXT;
CREATE TABLE FIND_BASE_EXT(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  activity_no                        VARCHAR(36) Comment '��̬ID',
  type                               VARCHAR(1) Comment '����',
  relation_user_id                   VARCHAR(36) Comment '�����û�ID',
  CONSTRAINT FIND_BASE_EXT_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(��ǩ��)                                                 *
-- *------------------------------------------------------------------------*
-- * ��ǩ�����  TAG_BASE_INFO                                              *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS TAG_BASE_INFO;
CREATE TABLE TAG_BASE_INFO(
  tag_no                             VARCHAR(36)                   NOT NULL Comment '��ǩ���',
  tag_name                           VARCHAR(300) Comment '��ǩ����',
  tag_type_no                        VARCHAR(36) Comment '��ǩ�����',
  tag_type_name                      VARCHAR(300) Comment '��ǩ�������',
  CONSTRAINT TAG_BASE_INFO_PK
  PRIMARY KEY(tag_no)
);


-- **************************************************************************
-- * ����ű� Table(��ǩ��̬��ϵ��)                                         *
-- *------------------------------------------------------------------------*
-- * ��ǩ��̬��ϵ�����  TAG_DYNAMIC_RELATION                               *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS TAG_DYNAMIC_RELATION;
CREATE TABLE TAG_DYNAMIC_RELATION(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  activity_no                        VARCHAR(36) Comment '��̬���',
  tag_no                             VARCHAR(36) Comment '��ǩ���',
  CONSTRAINT TAG_DYNAMIC_RELATION_PK
  PRIMARY KEY(uuid)
);


-- **************************************************************************
-- * ����ű� Table(�ֵ��)                                                 *
-- *------------------------------------------------------------------------*
-- * �ֵ�����  DICTIONARY_BASE_INFO                                       *
-- *------------------------------------------------------------------------*
-- * version     :                                                              *
-- * CREATE����: 2017/6/14                                                      *
-- **************************************************************************

DROP TABLE IF EXISTS DICTIONARY_BASE_INFO;
CREATE TABLE DICTIONARY_BASE_INFO(
  uuid                               VARCHAR(36)                   NOT NULL Comment '�߼�����',
  dict_type_code                     VARCHAR(36) Comment '�ֵ����ʹ���',
  dict_type_name                     VARCHAR(300) Comment '�ֵ���������',
  dict_code                          VARCHAR(36) Comment '�ֵ����',
  dict_value                         VARCHAR(300) Comment '�ֵ�ֵ',
  dict_parent_uuid                   VARCHAR(36) Comment '�ֵ��ϼ�����',
  CONSTRAINT DICTIONARY_BASE_INFO_PK
  PRIMARY KEY(uuid)
);


