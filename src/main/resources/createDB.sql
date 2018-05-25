/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-25 10:59:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for module
-- ----------------------------
DROP TABLE IF EXISTS `module`;
CREATE TABLE `module` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module
-- ----------------------------
INSERT INTO `module` VALUES ('1', 'add');
INSERT INTO `module` VALUES ('2', 'delete');
INSERT INTO `module` VALUES ('3', 'update');
INSERT INTO `module` VALUES ('4', 'query');

-- ----------------------------
-- Table structure for module_role
-- ----------------------------
DROP TABLE IF EXISTS `module_role`;
CREATE TABLE `module_role` (
  `rid` int(11) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  KEY `mid` (`mid`),
  KEY `rid` (`rid`),
  CONSTRAINT `mid` FOREIGN KEY (`mid`) REFERENCES `module` (`mid`),
  CONSTRAINT `rid` FOREIGN KEY (`rid`) REFERENCES `role` (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module_role
-- ----------------------------
INSERT INTO `module_role` VALUES ('1', '1');
INSERT INTO `module_role` VALUES ('1', '2');
INSERT INTO `module_role` VALUES ('1', '3');
INSERT INTO `module_role` VALUES ('1', '4');
INSERT INTO `module_role` VALUES ('2', '1');
INSERT INTO `module_role` VALUES ('2', '3');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin');
INSERT INTO `role` VALUES ('2', 'customer');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `uid` bigint(20) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  KEY `uid` (`uid`),
  KEY `r_id` (`rid`),
  CONSTRAINT `r_id` FOREIGN KEY (`rid`) REFERENCES `role` (`rid`),
  CONSTRAINT `uid` FOREIGN KEY (`uid`) REFERENCES `user_test` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('2', '2');

-- ----------------------------
-- Table structure for user_test
-- ----------------------------
DROP TABLE IF EXISTS `user_test`;
CREATE TABLE `user_test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pass_word` varchar(50) DEFAULT NULL COMMENT '密码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_test
-- ----------------------------
INSERT INTO `user_test` VALUES ('1', '123', '小明');
INSERT INTO `user_test` VALUES ('2', '1992', '小刚');
INSERT INTO `user_test` VALUES ('3', '123', '小亮');
INSERT INTO `user_test` VALUES ('4', '123', '小红');
INSERT INTO `user_test` VALUES ('5', '123', '小红花');
