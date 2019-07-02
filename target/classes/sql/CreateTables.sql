-- 生成用户基础信息表
drop table user_base_info;
-- 生成用户登录表
drop table user_log_info;
-- 生成用户收货地址表
drop table user_Address;
-- 生成会员登记表
drop table user_level;
-- 生成用户积分表
-- drop table user_integral;
-- 生成订单表
-- drop table user_wallet;
drop table order_Info;
-- 生成用户收藏表
drop table user_collection;
-- 生成用户消息表
drop table user_message;
-- 生成用户好友表
drop table user_friends;
-- 生成店铺基本信息表
drop table shop_base_info;
-- 生成商品基本信息表
drop table commodity_base_info;
-- 生成店铺商品关联表
drop table shop_commodity;
-- 生成店铺等级表
 drop table shop_level;
-- 生成商品类别表
drop table commodity_type;
-- 生成购物车表
drop table shop_trolley;
-- 生成商品评论表
drop table commodity_comtent;


CREATE TABLE `User_Base_Info` (
  `user_id` varchar(11) NOT NULL COMMENT '注册新用户生成编号',
  `user_phone_num` varchar(12)  NOT NULL COMMENT '用户注册手机号',
  `user_email` varchar(255) NULL COMMENT '用户邮箱',
  `user_name` varchar(255) NULL DEFAULT '' COMMENT '用户名称',
  `user_sexy` char(2) NOT NULL DEFAULT 'F' COMMENT '用户性别(F为女，M为男，默认F)',
  `user_birthday` date NULL COMMENT '用户生日',
  `user_account` varchar(255) NOT NULL COMMENT '用户登录账户（可以用账号登录，也可以用手机号登录）',
  `user_account_status` char(2) NOT NULL DEFAULT 0 COMMENT '用户帐号状态（0表示在用，1表示注销）',
  `user_integral` int(255) NULL COMMENT '用户积分',
  `user_register_time` datetime(0) NULL COMMENT '用户注册时间',
	`user_password` varchar(255) NOT NULL COMMENT '用户登录密码',
  `user_info_ext1` varchar(255) NULL COMMENT '拓展字段1',
  `user_info_ext2` varchar(255) NULL COMMENT '拓展字段2',
  PRIMARY KEY (`user_id`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `user_log_info` (
  `user_id` varchar(11) NOT NULL COMMENT '注册用户生成编号',
  `user_account` varchar(255) NOT NULL COMMENT '用户帐号',
  `user_phone_num` varchar(12) NOT NULL COMMENT '用户手机号',
  `user_password` varchar(255) NOT NULL COMMENT '用户登录密码',
  `user_status` int(2) DEFAULT '0' COMMENT '用户当前状态（0在线，1注销）',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_address` (
  `user_address_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收货地址自动生成编号',
  `user_account` varchar(255) NOT NULL COMMENT '用户帐号',
  `user_address` varchar(255) DEFAULT NULL COMMENT '收货地址',
  `user_address_status` int(2) DEFAULT '0' COMMENT '收货地址状态（0表示在用，1表示没用）',
  `user_address_order` int(4) DEFAULT NULL COMMENT '收货地址排序（0表示默认地址）',
  PRIMARY KEY (`user_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_level` (
  `user_level_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '会员等级编号',
  `user_level_low_score` int(8) DEFAULT NULL COMMENT '满足会员等级所需最低分',
  `user_level_high_score` int(8) DEFAULT NULL COMMENT '满足会员等级所需最高分',
  `user_level_name` varchar(255) DEFAULT NULL COMMENT '会员等级名称',
  `user_level_ext` varchar(255) DEFAULT NULL COMMENT '拓展字段',
  PRIMARY KEY (`user_level_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `order_info` (
  `user_orde_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单自动生成编号',
  `user_account` varchar(255) NOT NULL COMMENT '用户帐号',
  `merchant_account` varchar(255) NOT NULL COMMENT '商家账号',
  `user_address` varchar(255) DEFAULT NULL COMMENT '收货地址',
  `merchant_address` varchar(255) DEFAULT NULL COMMENT '发货地址',
  `commodity_id` varchar(255) DEFAULT NULL COMMENT '商品编号',
  `commodity_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `commodity_price` decimal(10,2) DEFAULT '0.00' COMMENT '商品单价',
  `commodity_number` int(11) DEFAULT NULL COMMENT '商品数量',
  `order_status` int(2) DEFAULT NULL COMMENT '订单状态（0表示签收，1表示运输中，2表示未发货）',
  `user_phone_number` varchar(12) DEFAULT NULL COMMENT '收货人联系方式',
  `order_trade_time` datetime DEFAULT NULL COMMENT '交易时间',
  `order_start_time` datetime DEFAULT NULL COMMENT '发货时间',
  `order_end_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '收货时间',
  `discount_price` decimal(10,2) DEFAULT '0.00' COMMENT '优惠金额',
  `order_ext` varchar(255) DEFAULT NULL COMMENT '拓展字段',
  PRIMARY KEY (`user_orde_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_wallet` (
  `user_wallet_id` int(11) NOT NULL COMMENT ' 用户钱包编号',
  `user_account` varchar(255) NOT NULL COMMENT ' 用户帐号',
  `user_balance` decimal(10,0) DEFAULT NULL COMMENT ' 钱包余额',
  `user_walete_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT ' 钱包金额上次变更时间',
  PRIMARY KEY (`user_wallet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_collection` (
  `collection_id` int(11) NOT NULL AUTO_INCREMENT COMMENT ' 收藏表自动生成编号',
  `user_account` varchar(255) NOT NULL COMMENT ' 收藏表的收藏人账号',
  `collected_accout` varchar(255) NOT NULL COMMENT ' 被收藏的账号，如文章编号，店铺编号，商品编号',
  `collection_status` int(2) DEFAULT NULL COMMENT ' 收藏状态（0为收藏中，1为舍弃）',
  `collection_type` int(2) DEFAULT NULL COMMENT ' 收藏类别（0为商铺，1为商品，2为文章）',
  `collection_order` int(12) DEFAULT NULL COMMENT ' 收藏排序',
  `collection_time` datetime DEFAULT NULL COMMENT ' 收藏时间',
  `collection_remark` varchar(255) DEFAULT NULL COMMENT ' 收藏备注',
  `collection_last_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT ' 最近一次操作时间',
  `collection_ext` varchar(255) DEFAULT NULL COMMENT ' 拓展字段',
  PRIMARY KEY (`collection_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_message` (
  `message_id` int(50) NOT NULL DEFAULT '100001' COMMENT '个人消息自动生成编号',
  `messaging_user_account` varchar(255) NOT NULL COMMENT ' 发送人账号',
  `messaged_user_account` varchar(255) DEFAULT NULL COMMENT ' 收消息人账号',
  `message_status` int(2) DEFAULT '0' COMMENT ' 消息阅读状态(0已读 1未读)',
  `message_send_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT ' 消息发送时间',
  `message_content` varchar(255) DEFAULT NULL COMMENT ' 消息内容',
  `message_ext` varchar(255) DEFAULT NULL COMMENT '拓展字段',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_friends` (
  `fridend_id` int(11) NOT NULL AUTO_INCREMENT COMMENT ' 好友表自动生成编号',
  `friending_user_account` varchar(255) DEFAULT NULL COMMENT ' 用户帐号(关注人编号)',
  `friending_user_name` varchar(255) DEFAULT NULL COMMENT ' 用户姓名',
  `friended_user_account` varchar(255) DEFAULT NULL COMMENT ' 用户帐号(被关注人账号)',
  `friended_user_name` varchar(255) DEFAULT NULL COMMENT ' 被关注人姓名',
  `friend_nickname` varchar(255) DEFAULT NULL COMMENT ' 被关注人备注名',
  `friend_status` int(2) DEFAULT '0' COMMENT ' 被关注人状态(0为关注 1为取消关注)',
  `friend_time` datetime DEFAULT NULL COMMENT ' 关注时间',
  `friend_last_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT ' 最近一次更新时间',
  `friend_ext` varchar(255) DEFAULT NULL COMMENT ' 拓展字段',
  PRIMARY KEY (`fridend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `ebusiness`.`shop_base_info`  (
  `shop_id` int(8) NOT NULL AUTO_INCREMENT COMMENT ' 店铺自动生成编号',
  `shop_account` varchar(255) NULL COMMENT ' 店铺账号',
  `shop_user_account` varchar(255) NOT NULL COMMENT ' 店铺主帐号',
  `shop_name` varchar(255) NULL COMMENT ' 店铺名称',
  `shop_user_name` varchar(255) NULL COMMENT ' 店主名称',
  `shop_level` int(5) NULL DEFAULT 1 COMMENT ' 店铺等级',
  `shop_money` decimal(11, 2) NULL COMMENT ' 店铺成交额',
  `shop_number` int(5) NULL COMMENT ' 店铺成交数量',
  `shop_status` int(2) NULL DEFAULT 0 COMMENT ' 店铺状态(0表示开业 1表示营业 2表示暂停营业)',
  `shop_start_time` datetime(0) NULL COMMENT ' 开店时间',
  `shop_end_time` datetime(0) NULL COMMENT ' 店铺停止时间',
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `commodity_base_info` (
  `commodity_id` int(12) NOT NULL AUTO_INCREMENT COMMENT ' 商品编号',
  `commodity_name` varchar(255) NOT NULL COMMENT ' 商品名称',
  `commodity_type_id` int(10) DEFAULT NULL COMMENT ' 商品类别编号',
  `commodity_start_time` datetime DEFAULT NULL COMMENT ' 上架时间',
  `commodity_end_time` datetime DEFAULT NULL COMMENT ' 下架时间',
  `commodity_status` int(2) DEFAULT '0' COMMENT ' 商品状态（0表示上架 1表示下架）',
  `commodity_img` varchar(255) DEFAULT NULL COMMENT ' 商品图片',
  `commodity_price` decimal(10,2) DEFAULT NULL COMMENT ' 商品价格',
  `commodity_desc` varchar(255) DEFAULT NULL COMMENT ' 商品描述',
  `commodity_size` double DEFAULT NULL COMMENT ' 商品大小',
  `commodity_color` varchar(255) DEFAULT NULL COMMENT ' 商品颜色',
  `commodity_ext1` varchar(255) DEFAULT NULL COMMENT ' 拓展字段1',
  `commodity_ext2` varchar(255) DEFAULT NULL COMMENT ' 拓展字段2',
  `commodity_ext3` varchar(255) DEFAULT NULL COMMENT ' 拓展字段3',
  PRIMARY KEY (`commodity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `shop_commodity` (
  `shop_commodity_id` int(11) NOT NULL AUTO_INCREMENT COMMENT ' 生成的店铺商品关联表id',
  `shop_account` varchar(255) NOT NULL COMMENT ' 店铺账号',
  `shop_name` varchar(255) DEFAULT NULL COMMENT ' 店铺名',
  `commodity_id` int(12) NOT NULL COMMENT ' 商品编号',
  `commodity_name` varchar(255) DEFAULT NULL COMMENT ' 商品名',
  `shop_commodity_ext1` varchar(255) DEFAULT NULL COMMENT ' 拓展字段1',
  PRIMARY KEY (`shop_commodity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `commodity_type` (
  `commodity_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT ' 商品类别编号',
  `commodity_type_name` varchar(255) DEFAULT NULL COMMENT ' 商品类别名称',
  `commodity_type_desc` varchar(255) DEFAULT NULL COMMENT ' 商品类别描述',
  `commodity_type_ext` varchar(255) DEFAULT NULL COMMENT ' 商品类别拓展字段',
  PRIMARY KEY (`commodity_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `shop_trolley` (
  `shop_trolley_id` int(11) NOT NULL COMMENT ' 购物车自动生成编号',
  `user_account` varchar(255) DEFAULT NULL COMMENT ' 用户帐户',
  `commodity_id` varchar(255) DEFAULT NULL COMMENT ' 商品id',
  `commodity_name` varchar(255) DEFAULT NULL COMMENT ' 商品名称',
  `shop_account` varchar(255) DEFAULT NULL COMMENT ' 店铺账号',
  `commodity_num` int(3) DEFAULT NULL COMMENT ' 商品数量',
  `shop_trolley_status` int(2) DEFAULT NULL COMMENT ' 在购物车中状态（0表示在购物车中，1表示移出）',
  `shop_trolley_add_time` datetime DEFAULT NULL COMMENT ' 添加到购物车时间',
  `shop_trolley_last_time` datetime DEFAULT NULL COMMENT ' 上次操作购物车时间',
  `shop_trolley_ext` varchar(255) DEFAULT NULL COMMENT '  购物车拓展字段',
  PRIMARY KEY (`shop_trolley_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `commodity_comtent` (
  `commodity_comment_id` int(11) NOT NULL COMMENT ' 商品评论编号',
  `commodity_id` int(255) NOT NULL COMMENT ' 商品id',
  `commodity_comment_content` varchar(255) DEFAULT NULL COMMENT ' 评论内容',
  `commodity_comment_time` datetime DEFAULT NULL COMMENT ' 评论时间',
  `user_account` varchar(255) DEFAULT NULL COMMENT ' 评论用户帐号',
  `shop_account` varchar(255) DEFAULT NULL COMMENT ' 店铺账号',
  `commodity_comment_ext` varchar(255) DEFAULT NULL COMMENT ' 评论拓展字段',
  PRIMARY KEY (`commodity_comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `shop_level` (
  `shop_level_id` int(11) NOT NULL COMMENT ' 店铺等级',
  `shop_level_name` varchar(255) DEFAULT NULL COMMENT ' 店铺满足等级最低交易额',
  `shop_level_low` varchar(255) DEFAULT NULL COMMENT ' 店铺满足等级最高交易额',
  `shop_level_high` varchar(255) DEFAULT NULL COMMENT ' 店铺等级名',
  `shop_level_desc` varchar(255) DEFAULT NULL COMMENT ' 店铺等级描述',
  `shop_level_ext` varchar(255) DEFAULT NULL COMMENT ' 拓展字段',
  PRIMARY KEY (`shop_level_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `atricle` (
  `article_id` int(11) NOT NULL COMMENT ' 文章编号',
  `user_account` varchar(255) DEFAULT NULL COMMENT ' 作者账号',
  `article_title` varchar(255) DEFAULT NULL COMMENT ' 文章标题',
  `article_comtent` varchar(255) DEFAULT NULL COMMENT ' 文章内容',
  `article_first_time` datetime DEFAULT NULL COMMENT ' 文章发布时间',
  `atricle_last_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT ' 文章更新时间',
  `article_type_id` int(11) DEFAULT NULL COMMENT ' 文章类别编号',
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `article_up` (
  `article_id` int(11) NOT NULL COMMENT ' 文章编号',
  `user_account` varchar(255) DEFAULT NULL COMMENT ' 点赞人账号',
  `article_up_status` int(2) DEFAULT '1' COMMENT ' 点赞状态 ',
  `article_up_time` datetime DEFAULT NULL COMMENT ' 点赞时间',
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `article_type` (
  `article_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT ' 文章类型编码',
  `article_type_name` varchar(255) DEFAULT NULL COMMENT ' 文章类型名',
  `article_type_desc` varchar(255) DEFAULT NULL COMMENT ' 文章类型描述',
  `article_type_ext` varchar(255) DEFAULT NULL COMMENT ' 拓展字段',
  PRIMARY KEY (`article_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `aritcle_comment` (
  `article_comment_id` int(11) NOT NULL COMMENT ' 文章评论id',
  `article_id` int(11) DEFAULT NULL COMMENT ' 文章id',
  `author_account` varchar(255) DEFAULT NULL COMMENT ' 文章作者账号',
  `article_comment_content` varchar(255) DEFAULT NULL COMMENT ' 文章评论内容',
  `article_comment_sec` int(11) DEFAULT NULL COMMENT ' 二级评论编码',
  `article_comment_time` date DEFAULT NULL COMMENT ' 评论时间',
  `user_account` varchar(255) DEFAULT NULL COMMENT ' 评论者编号',
  PRIMARY KEY (`article_comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;