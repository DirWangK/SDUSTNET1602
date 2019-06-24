/*
 Navicat Premium Data Transfer

 Source Server         : popk
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : ewsdb

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 24/06/2019 15:33:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_equ
-- ----------------------------
DROP TABLE IF EXISTS `tb_equ`;
CREATE TABLE `tb_equ`  (
  `e_id` int(16) NOT NULL AUTO_INCREMENT,
  `snumber` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `iname` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `itype` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `dept` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `iproducetime` datetime(0) NULL DEFAULT NULL,
  `istarttime` datetime(0) NULL DEFAULT NULL,
  `repaircycle` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `latestrepairtime` datetime(0) NULL DEFAULT NULL,
  `istate` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `manu` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`e_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_equ
-- ----------------------------
INSERT INTO `tb_equ` VALUES (2, 'B1060', '心血管功能测定仪', '检测仪', '肿瘤科', '2018-05-17 00:00:00', '2018-09-15 00:00:00', '7天', '2019-05-28 19:24:54', '正常', '天津医疗设备厂', '0528-1893479');
INSERT INTO `tb_equ` VALUES (3, 'C1070', '输液泵', '器械', '血透中心', '2016-08-28 00:00:00', '2017-10-18 00:00:00', '15天', '2019-05-28 19:24:58', '正常', '上海医疗设备厂', '0538-2274454');
INSERT INTO `tb_equ` VALUES (4, 'D2080', '超声治疗仪', '治疗仪', '器官移植中心', '2017-04-16 00:00:00', '2017-08-18 00:00:00', '15天', '2019-05-29 15:12:23', '正常', '北京医疗设备厂', '0528-5894132');
INSERT INTO `tb_equ` VALUES (5, 'E2905', '便携式心脏除颤仪', '治疗仪', '神经内科', '2018-06-16 00:00:00', '2018-08-18 00:00:00', '15天', '2019-05-30 11:38:09', '正常', '广东医疗设备厂', '0536-5487992');
INSERT INTO `tb_equ` VALUES (6, 'F3968', '动态心电分析系统', '检测仪', '心血管介入科', '2014-05-17 00:00:00', '2015-07-21 00:00:00', '30天', '2019-05-30 11:38:21', '正常', '天津医疗设备厂', '0528-4584522');
INSERT INTO `tb_equ` VALUES (7, 'G2930', '电脑传呼机', '治疗仪', '急救中心', '2017-05-18 00:00:00', '2017-09-14 00:00:00', '7天', '2019-05-31 10:23:36', '正常', '上海医疗设备厂', '0538-2274454');
INSERT INTO `tb_equ` VALUES (8, 'C1071', '输液泵', '器械', '甲亢中心', '2016-08-28 00:00:00', '2017-10-18 00:00:00', '15天', '2019-05-18 00:00:00', '正常', '上海医疗设备厂', '0538-2274454');
INSERT INTO `tb_equ` VALUES (9, 'H1957', '臭氧发生器', '器械', '精神科', '2015-08-17 00:00:00', '2015-09-16 00:00:00', '15天', '2019-05-17 00:00:00', '正常', '北京医疗设备厂', '0528-1234789');
INSERT INTO `tb_equ` VALUES (10, 'L1958', '动态心电图机', '检测仪', '呼吸中医科', '2014-05-17 00:00:00', '2015-07-21 00:00:00', '30天', '2019-05-12 00:00:00', '正常', '天津医疗设备厂', '0528-4584522');
INSERT INTO `tb_equ` VALUES (11, 'A1051', 'TCL动态心电图仪器', '检测仪', '肿瘤科', '2017-09-16 00:00:00', '2018-03-16 00:00:00', '15天', '2019-05-28 09:30:56', '正常', '北京医疗设备厂', '0528-1234789');
INSERT INTO `tb_equ` VALUES (12, 'M1950', '动态血压检测仪APB检测', '检测仪', '呼吸中医科', '2014-05-17 00:00:00', '2015-07-21 00:00:00', '15天', '2019-05-19 00:00:00', '正常', '北京医疗设备厂', '0528-1234789');
INSERT INTO `tb_equ` VALUES (13, 'C1072', '输液泵', '器械', '皮肤科', '2016-08-28 00:00:00', '2017-10-18 00:00:00', '15天', '2019-05-18 00:00:00', '正常', '上海医疗设备厂', '0538-2274454');
INSERT INTO `tb_equ` VALUES (14, 'N1500', '胃肠动力治疗系统', '治疗仪', '肠胃科', '2017-06-27 00:00:00', '2017-09-25 00:00:00', '7天', '2019-05-28 09:47:21', '正常', '广东医疗设备厂', '0536-5487992');
INSERT INTO `tb_equ` VALUES (15, 'E2906', '便携式心脏除颤仪', '治疗仪', '肿瘤科', '2018-05-17 00:00:00', '2018-09-15 00:00:00', '15天', '2019-05-18 00:00:00', '正常', '广东医疗设备厂', '0536-5487992');
INSERT INTO `tb_equ` VALUES (16, 'C1073', '输液泵', '器械', '肠胃科', '2016-08-28 00:00:00', '2017-10-18 00:00:00', '15天', '2019-05-18 00:00:00', '正常', '上海医疗设备厂', '0538-2274454');
INSERT INTO `tb_equ` VALUES (17, 'D2081', '超声治疗仪', '治疗仪', '放疗科', '2017-04-16 00:00:00', '2017-08-18 00:00:00', '15天', '2019-05-15 00:00:00', '正常', '北京医疗设备厂', '0528-5894132');
INSERT INTO `tb_equ` VALUES (18, 'L1959', '动态心电图机', '检测仪', '肿瘤科', '2018-05-17 00:00:00', '2018-09-15 00:00:00', '30天', '2018-05-14 00:00:00', '正常', '天津医疗设备厂', '0528-4584522');
INSERT INTO `tb_equ` VALUES (19, 'F3969', '动态心电分析系统', '检测仪', '急救中心', '2014-05-17 00:00:00', '2015-07-21 00:00:00', '30天', '2019-05-12 00:00:00', '正常', '天津医疗设备厂', '0528-4584522');
INSERT INTO `tb_equ` VALUES (20, 'T1600', '血液分析仪', '检测仪', '化验科', '2017-09-15 00:00:00', '2017-12-18 00:00:00', '15天', '2019-05-16 00:00:00', '正常', '济南医疗设备厂', '0537-2748515');
INSERT INTO `tb_equ` VALUES (21, 'S1800', '肾脏渗透仪', '治疗仪', '血透中心', '2016-08-15 00:00:00', '2016-12-15 00:00:00', '7天', '2019-05-20 00:00:00', '正常', '广东医疗设备厂', '0536-5487992');
INSERT INTO `tb_equ` VALUES (22, 'P1900', '放射片仪器', '检测仪', '放疗科', '2017-09-12 00:00:00', '2017-11-15 00:00:00', '15天', '2019-05-17 00:00:00', '正常', '济南医疗设备厂', '0537-2748515');
INSERT INTO `tb_equ` VALUES (23, 'E2907', '便携式心脏除颤仪', '治疗仪', '急救中心', '2018-06-16 00:00:00', '2018-08-18 00:00:00', '15天', '2019-05-13 00:00:00', '正常', '广东医疗设备厂', '0536-5487992');
INSERT INTO `tb_equ` VALUES (24, 'C1074', '输液泵', '器械', '精神科', '2016-08-28 00:00:00', '2017-10-18 00:00:00', '15天', '2019-05-18 00:00:00', '正常', '上海医疗设备厂', '0538-2274454');
INSERT INTO `tb_equ` VALUES (25, 'M1951', '动态血压检测仪APB检测', '检测仪', '急救中心', '2014-05-17 00:00:00', '2015-07-21 00:00:00', '15天', '2019-05-19 00:00:00', '正常', '北京医疗设备厂', '0528-1234789');
INSERT INTO `tb_equ` VALUES (26, 'N1501', '胃肠动力治疗系统', '治疗仪', '肠胃科', '2015-09-16 00:00:00', '2016-11-11 00:00:00', '7天', '2019-05-19 00:00:00', '正常', '广东医疗设备厂', '0536-5487992');
INSERT INTO `tb_equ` VALUES (27, 'K1888', '生物显微镜仪器', '分析仪', '化验科', '2017-09-15 00:00:00', '2017-12-18 00:00:00', '15天', '2019-05-16 00:00:00', '正常', '济南医疗设备厂', '0537-2748515');
INSERT INTO `tb_equ` VALUES (28, 'L1960', '动态心电图机', '检测仪', '肿瘤科', '2014-05-17 00:00:00', '2015-07-21 00:00:00', '30天', '2019-05-12 00:00:00', '正常', '天津医疗设备厂', '0528-4584522');
INSERT INTO `tb_equ` VALUES (29, 'C1075', '输液泵', '器械', '急救中心', '2016-08-28 00:00:00', '2017-10-18 00:00:00', '15天', '2019-05-18 00:00:00', '正常', '上海医疗设备厂', '0538-2274454');
INSERT INTO `tb_equ` VALUES (30, 'S1801', '肾脏渗透仪', '治疗仪', '血透中心', '2014-09-15 00:00:00', '2015-11-12 00:00:00', '7天', '2019-05-28 09:32:26', '正常', '广东医疗设备厂', '0536-5487992');

-- ----------------------------
-- Table structure for tb_rep
-- ----------------------------
DROP TABLE IF EXISTS `tb_rep`;
CREATE TABLE `tb_rep`  (
  `r_id` int(10) NOT NULL AUTO_INCREMENT,
  `snumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `iname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `itype` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dept` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `iproducetime` datetime(0) NULL DEFAULT NULL,
  `pastrepair` datetime(0) NULL DEFAULT NULL,
  `reptime` datetime(0) NULL DEFAULT NULL,
  `repairpeople` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`r_id`, `snumber`) USING BTREE,
  UNIQUE INDEX `nuique`(`snumber`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_rep
-- ----------------------------
INSERT INTO `tb_rep` VALUES (43, 'F3968', '动态心电分析系统', '检测仪', '心血管介入科', '2014-05-17 00:00:00', '2019-04-01 00:00:00', '2019-05-30 11:38:21', 'a');
INSERT INTO `tb_rep` VALUES (44, 'G2930', '电脑传呼机', '治疗仪', '急救中心', '2017-05-18 00:00:00', '2019-04-01 09:30:18', '2019-05-31 10:23:36', 'c');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `upwd` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `email` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `role` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `registerTime` date NULL DEFAULT NULL,
  `lastLoginTime` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'laozhang', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'admin', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES (2, 'zhang2', 'e3ceb5881a0a1fdaad01296d7554868d', 'zhang2@qq.com', 'admin', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES (3, 'zzz', '1a100d2c0dab19c4430e7d73762b3423', '1433324@qq.com', 'checker', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES (4, 'admin', '96e79218965eb72c92a549dd5a330112', 'qwert@qq.com', 'checker', '2019-05-21', '2019-05-29');
INSERT INTO `tb_user` VALUES (15, 'admin2', '96e79218965eb72c92a549dd5a330112', 'dsfasta@qq.com', 'employee', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES (16, 'qwer', '96e79218965eb72c92a549dd5a330112', 'wqrwqr@qq.com', 'employee', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES (20, 'admin1', '1bbd886460827015e5d605ed44252251', '6666666666666@qq.con', 'employee', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES (21, 'a', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'admin', '2019-05-22', '2019-05-31');
INSERT INTO `tb_user` VALUES (22, 'b', 'e3ceb5881a0a1fdaad01296d7554868d', 'qwer@qq.com', 'employee', '2019-05-22', '2019-05-22');
INSERT INTO `tb_user` VALUES (23, 'c', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'checker', '2019-05-22', '2019-05-31');
INSERT INTO `tb_user` VALUES (24, 'd', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'employee', '2019-05-22', '2019-05-22');
INSERT INTO `tb_user` VALUES (25, 'e', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'employee', '2019-05-22', '2019-05-22');
INSERT INTO `tb_user` VALUES (26, 'f', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'employee', '2019-05-22', '2019-05-22');
INSERT INTO `tb_user` VALUES (27, 'g', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'employee', '2019-05-22', '2019-05-22');
INSERT INTO `tb_user` VALUES (28, 'h', '96e79218965eb72c92a549dd5a330112', 'qwer@qq.com', 'employee', '2019-05-22', '2019-05-22');
INSERT INTO `tb_user` VALUES (29, 'z', '96e79218965eb72c92a549dd5a330112', '123@qq.com', 'employee', '2019-05-22', '2019-05-22');

-- ----------------------------
-- View structure for needrep
-- ----------------------------
DROP VIEW IF EXISTS `needrep`;
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `needrep` AS select `tb_equ`.`e_id` AS `e_id`,`tb_equ`.`snumber` AS `snumber`,`tb_equ`.`iname` AS `iname`,`tb_equ`.`itype` AS `itype`,`tb_equ`.`dept` AS `dept`,`tb_equ`.`iproducetime` AS `iproducetime`,`tb_equ`.`istarttime` AS `istarttime`,`tb_equ`.`repaircycle` AS `repaircycle`,`tb_equ`.`latestrepairtime` AS `latestrepairtime`,`tb_equ`.`istate` AS `istate`,`tb_equ`.`manu` AS `manu`,`tb_equ`.`tel` AS `tel` from `tb_equ` where ((to_days(now()) - to_days(`tb_equ`.`latestrepairtime`)) > substring_index(`tb_equ`.`repaircycle`,'天',1));

SET FOREIGN_KEY_CHECKS = 1;
