CREATE TABLE `t_boot_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `password` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '密码',
  `gender` varchar(4) COLLATE utf8_bin NOT NULL COMMENT '性别',
  `age` int(11) NOT NULL COMMENT '年龄',
	`email` VARCHAR(64) not null COMMENT '注册邮箱',
	`state` int(1) not null DEFAULT 0 COMMENT '0:未激活,1已激活',
  `birthday` date NOT NULL COMMENT '出生日期',
  PRIMARY KEY (`id`)
);