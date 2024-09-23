-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema football_app
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema football_app
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `football_app` DEFAULT CHARACTER SET utf8 ;
USE `football_app` ;

-- -----------------------------------------------------
-- Table `football_app`.`FOOTBALLER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `football_app`.`FOOTBALLER` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `dob` VARCHAR(45) NOT NULL,
  `nationality` VARCHAR(45) NOT NULL,
  `position` VARCHAR(45) NOT NULL,
  `FOOTBALL_TEAM_id` INT NOT NULL,
  PRIMARY KEY (`id`, `FOOTBALL_TEAM_id`),
  INDEX `fk_FOOTBALLER_FOOTBALL_TEAM1_idx` (`FOOTBALL_TEAM_id` ASC) VISIBLE,
  CONSTRAINT `fk_FOOTBALLER_FOOTBALL_TEAM1`
    FOREIGN KEY (`FOOTBALL_TEAM_id`)
    REFERENCES `football_app`.`FOOTBALL_TEAM` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `football_app`.`CONTRACT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `football_app`.`CONTRACT` (
  `id` INT NOT NULL,
  `start_date` VARCHAR(45) NOT NULL,
  `end_date` VARCHAR(45) NOT NULL,
  `salary` DOUBLE NOT NULL,
  `FOOTBALLER_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_CONTRACT_FOOTBALLER_idx` (`FOOTBALLER_id` ASC) VISIBLE,
  CONSTRAINT `fk_CONTRACT_FOOTBALLER`
    FOREIGN KEY (`FOOTBALLER_id`)
    REFERENCES `football_app`.`FOOTBALLER` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `football_app`.`FOOTBALL_TEAM`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `football_app`.`FOOTBALL_TEAM` (
  `id` INT NOT NULL,
  `team_name` VARCHAR(45) NOT NULL,
  `league` VARCHAR(45) NOT NULL,
  `stadium` VARCHAR(45) NOT NULL,
  `coach` VARCHAR(45) NOT NULL,
  `CONTRACT_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_FOOTBALL_TEAM_CONTRACT1_idx` (`CONTRACT_id` ASC) VISIBLE,
  CONSTRAINT `fk_FOOTBALL_TEAM_CONTRACT1`
    FOREIGN KEY (`CONTRACT_id`)
    REFERENCES `football_app`.`CONTRACT` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
