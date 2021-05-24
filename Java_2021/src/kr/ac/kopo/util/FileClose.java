package kr.ac.kopo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class FileClose {

	public static void close(InputStream is) {

		if (is != null) {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void close(InputStream bis, InputStream is) {
		FileClose.close(bis);
		FileClose.close(is);
	}

	public static void close(OutputStream bos, OutputStream os) {
		FileClose.close(bos);
		FileClose.close(os);
	}

	public static void close(FileReader fr) {

		if (fr != null) {
			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(FileWriter fw) {
		if (fw != null) {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void close(BufferedReader br) {

		if (br != null) {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(BufferedWriter bw) {
		if (bw != null) {
			try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void close(FileReader fr, FileWriter fw) {
		FileClose.close(fr);
		FileClose.close(fw);
	}

	public static void close(BufferedReader br, BufferedWriter bw) {
		FileClose.close(br);
		FileClose.close(bw);
	}

	///

	public static void close(FileInputStream fi) {

		if (fi != null) {
			try {
				fi.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(FileOutputStream fo) {
		if (fo != null) {
			try {
				fo.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void close(FileInputStream fi, FileOutputStream fo) {
		FileClose.close(fi);
		FileClose.close(fo);
	}

	//

	public static void close(ObjectInputStream ois) {

		if (ois != null) {
			try {
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ObjectOutputStream oos) {
		if (oos != null) {
			try {
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void close(ObjectInputStream ois, ObjectOutputStream oos) {
		FileClose.close(ois);
		FileClose.close(oos);
	}

}
