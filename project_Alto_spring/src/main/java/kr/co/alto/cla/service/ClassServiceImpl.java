package kr.co.alto.cla.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.co.alto.cla.dao.ClassDAO;
import kr.co.alto.cla.dto.ClassDTO;

@Service("classService")
@Transactional(propagation = Propagation.REQUIRED)
public class ClassServiceImpl implements ClassService {

	@Autowired
	private ClassDAO classDAO;
	
	@Override
	public List<ClassDTO> listClass() throws Exception {
		List<ClassDTO> classList = classDAO.selectAllclassList();
		return classList;
	}

	@Override
	public int addNewArticle(Map classMap) throws Exception {
		int class_code = classDAO.insertNewClass (classMap);
		classMap.put("class_code", class_code);
		classDAO.insertNewImage(classMap);
		return class_code;
	}

}
