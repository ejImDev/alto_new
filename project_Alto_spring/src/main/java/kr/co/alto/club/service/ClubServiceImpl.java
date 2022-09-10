package kr.co.alto.club.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.co.alto.area.dao.AreaDAO;
import kr.co.alto.area.dto.AreaDTO;
import kr.co.alto.club.dao.ClubDAO;
import kr.co.alto.club.dto.ClubDTO;
import kr.co.alto.club.dto.ClubListDTO;
import kr.co.alto.club.dto.JoinDTO;
import kr.co.alto.hobby.dao.HobbyDAO;
import kr.co.alto.hobby.dto.HobbyDTO;
import kr.co.alto.hobby.dto.HobbysubDTO;
import kr.co.alto.mypage.dao.MypageDAO;
import kr.co.alto.mypage.dto.likeDTO;

@Service("clubService")
@Transactional(propagation = Propagation.REQUIRED)
public class ClubServiceImpl implements ClubService {
	
	@Autowired
	private ClubDAO clubDAO;
	@Autowired
	private HobbyDAO hobbyDAO;
	@Autowired
	private AreaDAO areaDAO;
	@Autowired
	private MypageDAO mypageDAO;
	
	@Override
	public void clubOpen(ClubDTO clubDTO) throws DataAccessException {

		String club_code = clubDAO.selectNewClubCode();
		System.out.println("new club_code: "+ club_code);
		
		clubDTO.setClub_code(club_code);
		
		clubDAO.clubOpen(clubDTO);
	}

	@Override
	public Map<String, Object> clubMainList(String mem_id) throws DataAccessException {
		Map<String, Object> clubMainMap = new HashMap<>();
		
		List<HobbyDTO> AllHobbyList = hobbyDAO.selectAllHobbyList();
		
		if (!mem_id.equals("")) {
			List<likeDTO> memlikeList = mypageDAO.selectLikeList(mem_id);		
			
			clubMainMap.put("memlikeList", memlikeList);
		}
		
		List<ClubListDTO> bestClubList = clubDAO.selectBestClubList();
		List<ClubListDTO> newClubList = clubDAO.selectNewClubList();
		List<ClubListDTO> peoClubList = clubDAO.selectPeoClubList();
		
		List<HashMap<String, Object>> topHobby = clubDAO.selectTopHobby();	
		
		for (int i=0; i<topHobby.size(); i++) {
			String hobby_code = (String) topHobby.get(i).get("CATE_M");
			List<ClubListDTO> topHobbyList = clubDAO.selectTopHobbyList(hobby_code);
			clubMainMap.put("topHobbyList"+i, topHobbyList);
		}
		
		clubMainMap.put("topHobby", topHobby);
		clubMainMap.put("AllHobbyList", AllHobbyList);
		clubMainMap.put("bestClubList", bestClubList);
		clubMainMap.put("newClubList", newClubList);
		clubMainMap.put("peoClubList", peoClubList);
		
		return clubMainMap;
	}
	
	@Override
	public Map<String, Object> clubSearchList() throws DataAccessException {
		Map<String, Object> clubSearchMap = new HashMap<>();
		
		List<HobbyDTO> allHobbyList = hobbyDAO.selectAllHobbyList();
		List<AreaDTO> allAreaList = areaDAO.selectAllAreaList();				
		
		clubSearchMap.put("allHobbyList", allHobbyList);
		clubSearchMap.put("allAreaList", allAreaList);
		
		return clubSearchMap;
		
	}
	
	@Override
	public Map<String, Object> selectHobClubList(String hobby_code) throws DataAccessException {
		Map<String, Object> clubSearchMap = new HashMap<>();
		
		List<HobbyDTO> allHobbyList = hobbyDAO.selectAllHobbyList();
		List<AreaDTO> allAreaList = areaDAO.selectAllAreaList();
		
		List<ClubListDTO> hobClubList = clubDAO.selectHobClubList(hobby_code);
		
		
		clubSearchMap.put("allHobbyList", allHobbyList);
		clubSearchMap.put("allAreaList", allAreaList);
		clubSearchMap.put("hobClubList", hobClubList);
		
		return clubSearchMap;
	}

	@Override
	public Map<String, Object> selectClubInfo(String club_code) throws DataAccessException {
		Map<String, Object> clubInfoMap = new HashMap<>();
		
		ClubDTO clubInfo = clubDAO.selectClubInfo(club_code);
		List<JoinDTO> clubMemberList = clubDAO.selectClubMemberList(club_code);
		
		if (clubInfo.getCate_s_name() == null) {
			clubInfo.setCate_s_name("없음");
		}
		
		clubInfoMap.put("clubInfo", clubInfo);
		clubInfoMap.put("clubMemberList", clubMemberList);
		
		return clubInfoMap;
	}

	@Override
	public void clubJoin(Map<String, Object> joinMap) throws DataAccessException {
		String join_code = clubDAO.selectNewJoinCode();
		
		joinMap.put("join_code", join_code);
		
		clubDAO.clubJoin(joinMap);
	}
	
}
