package cn.dw.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// �����Ϊ������,��Ҫ��������ݵ����Ӳ�������Դ�ͷ�(���鹹�췽��˽��)
public class JdbcUtils {
	// ���ⲿ���ܹ�new����,�Ժ�ͨ���������÷���,��˷�������static
	private JdbcUtils() {
	}

	// ��̬��,������ص�ʱ��ִ����ִ��һ��
	static {
		// һ������,�ļ���Դ�ļ��ض����ڴ˾�̬�����
		System.out.println("-------------");
		// ͨ����ȫ������������Ϣ.���д���Ϳ���ʵ�����ݿ������ļ���
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// �쳣����ֱ�Ӵ�ӡ,����Ҫ�����׳�
			throw new RuntimeException(e);
		}
	}

	// ��дһ������ʵ�����ݿ������
	public static Connection getConnection() {
		// �������ݿ���Ҫ���ã�url username password (�����Լ������ݿ�����,�˺ź�����)
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		  System.out.println(JdbcUtils.getConnection());
		  System.out.println(JdbcUtils.getConnection());
		  System.out.println(JdbcUtils.getConnection());
		  System.out.println(JdbcUtils.getConnection());
		  System.out.println(JdbcUtils.getConnection());

	}
}







