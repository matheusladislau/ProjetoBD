-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema test
-- -----------------------------------------------------
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pessoa` (
  `idPessoa` INT NOT NULL AUTO_INCREMENT,
  `nomePessoa` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPessoa`),
  UNIQUE INDEX `idPessoa_UNIQUE` (`idPessoa` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Telefone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Telefone` (
  `idTelefone` INT NOT NULL AUTO_INCREMENT,
  `idPessoa` INT NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTelefone`),
  UNIQUE INDEX `idTelefone_UNIQUE` (`idTelefone` ASC),
  INDEX `fk_Telefone_Pessoa_idx` (`idPessoa` ASC),
  CONSTRAINT `fk_Telefone_Pessoa`
    FOREIGN KEY (`idPessoa`)
    REFERENCES `mydb`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Livro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Livro` (
  `idLivro` INT NOT NULL AUTO_INCREMENT,
  `nomeLivro` VARCHAR(30) NOT NULL,
  `sinopseLivro` LONGTEXT NOT NULL,
  `autorLivro` VARCHAR(45) NOT NULL,
  `editoraLivro` VARCHAR(30) NOT NULL,
  `anoPublicacao` INT NOT NULL,
  PRIMARY KEY (`idLivro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Emprestimo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Emprestimo` (
  `idLivro` INT NOT NULL,
  `idPessoa` INT NOT NULL,
  `devolvido` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idLivro`, `idPessoa`),
  INDEX `fk_Livro_has_Pessoa_Pessoa1_idx` (`idPessoa` ASC),
  INDEX `fk_Livro_has_Pessoa_Livro1_idx` (`idLivro` ASC),
  CONSTRAINT `fk_Livro_has_Pessoa_Livro1`
    FOREIGN KEY (`idLivro`)
    REFERENCES `mydb`.`Livro` (`idLivro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_has_Pessoa_Pessoa1`
    FOREIGN KEY (`idPessoa`)
    REFERENCES `mydb`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
