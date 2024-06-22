/*
 Navicat Premium Data Transfer

 Source Server         : KK云3307
 Source Server Type    : MySQL
 Source Server Version : 80027 (8.0.27)
 Source Host           : 180.188.45.71:3307
 Source Schema         : security_db

 Target Server Type    : MySQL
 Target Server Version : 80027 (8.0.27)
 File Encoding         : 65001

 Date: 22/06/2024 10:18:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `describe` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` (`id`, `name`, `describe`) VALUES (1, 'ROLE_super', '超级管理员');
INSERT INTO `sys_role` (`id`, `name`, `describe`) VALUES (2, 'ROLE_admin', '普通管理员');
INSERT INTO `sys_role` (`id`, `name`, `describe`) VALUES (3, 'ROLE_user', '普通用户');
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(255) NOT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT '1',
  `account_non_expired` tinyint(1) NOT NULL DEFAULT '1',
  `account_non_locked` tinyint(1) NOT NULL DEFAULT '1',
  `credentials_non_expired` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` (`id`, `username`, `password`, `enabled`, `account_non_expired`, `account_non_locked`, `credentials_non_expired`) VALUES (1, 'root', '{noop}123', 1, 1, 1, 1);
INSERT INTO `sys_user` (`id`, `username`, `password`, `enabled`, `account_non_expired`, `account_non_locked`, `credentials_non_expired`) VALUES (2, 'admin', '{noop}123', 1, 1, 1, 1);
INSERT INTO `sys_user` (`id`, `username`, `password`, `enabled`, `account_non_expired`, `account_non_locked`, `credentials_non_expired`) VALUES (3, 'Leo', '{noop}123', 1, 1, 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for sysuser_role
-- ----------------------------
DROP TABLE IF EXISTS `sysuser_role`;
CREATE TABLE `sysuser_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int DEFAULT NULL,
  `rid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`),
  KEY `rid` (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of sysuser_role
-- ----------------------------
BEGIN;
INSERT INTO `sysuser_role` (`id`, `uid`, `rid`) VALUES (1, 1, 1);
INSERT INTO `sysuser_role` (`id`, `uid`, `rid`) VALUES (2, 1, 2);
INSERT INTO `sysuser_role` (`id`, `uid`, `rid`) VALUES (3, 2, 2);
INSERT INTO `sysuser_role` (`id`, `uid`, `rid`) VALUES (4, 3, 3);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
