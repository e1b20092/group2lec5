package oit.is.group2.lec5.group2lec5.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FruitMapper {

  @Select("SELECT ID, NAME,PRICE FROM FRUIT")
  ArrayList<Fruit> selectAllFruit();

}
