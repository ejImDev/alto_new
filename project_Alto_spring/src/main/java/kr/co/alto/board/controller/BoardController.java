package kr.co.alto.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface BoardController {
	
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ResponseEntity addNewArticle(MultipartHttpServletRequest multipartRequest, HttpServletResponse response) throws Exception;
	
	public ModelAndView viewArticle(@RequestParam("notice_num") int notice_num, HttpServletRequest request, 
									HttpServletResponse response) throws Exception;
	public ResponseEntity modArticle(MultipartHttpServletRequest multipartRequest, HttpServletResponse response) 
			throws Exception;
	public ResponseEntity removeArticle(@RequestParam("notice_num") int notice_num, HttpServletRequest request, HttpServletResponse response) 
			throws Exception;
	public void removeModFile(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	}
