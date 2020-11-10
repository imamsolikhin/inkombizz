/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : 127.0.0.1:3306
 Source Schema         : ikb_coursenet

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 10/11/2020 18:20:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mst_city
-- ----------------------------
DROP TABLE IF EXISTS `mst_city`;
CREATE TABLE `mst_city` (
  `Code` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `Name` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `ProvinceCode` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `ActiveStatus` tinyint(1) DEFAULT NULL,
  `CreatedBy` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `CreatedDate` datetime DEFAULT NULL,
  `UpdatedBy` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `UpdatedDate` datetime DEFAULT NULL,
  `InActiveBy` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `InActiveDate` datetime DEFAULT NULL,
  `Remark` text CHARACTER SET latin1 COLLATE latin1_swedish_ci,
  PRIMARY KEY (`Code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of mst_city
-- ----------------------------
BEGIN;
INSERT INTO `mst_city` VALUES ('BDG', 'Bandung', 'JW-BRT', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `mst_city` VALUES ('JKT-B', 'Jakarta Barat', 'DKI', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `mst_city` VALUES ('SMG', 'Semarang', 'JW-TGH', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
