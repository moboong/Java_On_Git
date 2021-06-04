package kr.ac.kopo.project02.service;

import java.util.List;

import kr.ac.kopo.project02.dao.BankingDAO;
import kr.ac.kopo.project02.vo.AccountVO;
import kr.ac.kopo.project02.vo.ClientVO;
import kr.ac.kopo.project02.vo.TransactionVO;

public class BankingService {

	private BankingDAO dao;

	public BankingService() {
		dao = new BankingDAO();
	}
	
	public ClientVO loginService(ClientVO newClient) throws Exception {
		
		ClientVO client = dao.loginDAO(newClient);
		
		return client;
	}

	public void addService(AccountVO newAccount) throws Exception {

		dao.addDAO(newAccount);
	}

	public int updateService(AccountVO newAccount) throws Exception {

		int check = dao.updateDAO(newAccount);

		return check;
	}

	public int deleteService(AccountVO newAccount) throws Exception {

		int check = dao.deleteDAO(newAccount);
		return check;
	}

	public List<AccountVO> searchService(AccountVO newAccount) throws Exception {

		List<AccountVO> list = dao.searchDAO(newAccount);

		return list;
	}

	public List<TransactionVO> transService(AccountVO newAccount) throws Exception {

		List<TransactionVO> list = dao.transDAO(newAccount);

		return list;
	}

	public int transferService(AccountVO newAccount) throws Exception {

		int check = dao.transferDAO(newAccount);

		return check;
	}

	public int dewiService(AccountVO newAccount) throws Exception {

		int check = dao.dewiDAO(newAccount);
		
		return check;
	}

}
