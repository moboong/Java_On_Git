package kr.ac.kopo.project;

public interface UserListIF {
	public void readAllUser();
	public void writeAllUser();
	public void printAll();
	public void register();
	public void login();
	public void logout();
	public void myInfo();
	public void updateID();
	public void updatePW();
	public void delUser();
}
