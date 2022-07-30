package kr.co.alto.cla.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import kr.co.alto.cla.dto.ClassDTO;

public interface ClassDAO {

	public List<ClassDTO> selectAllclassList(Map listMap) throws DataAccessException;
	public String insertNewClass(Map classMap) throws DataAccessException;
	public void insertNewImage(Map classMap) throws DataAccessException;
}
