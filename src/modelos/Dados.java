package modelos;

import java.util.Random;

public class Dados {
	public static int rolaD4() {
		Random gera = new Random();
        int num = 0;
        while(num < 1) {
        	num = gera.nextInt(5);
        }
		return num;
	}
	
	public static int rolaD6() {
		Random gera = new Random();
        int num = 0;
        while(num < 1) {
        	num = gera.nextInt(7);
        }
		return num;
	}
	
	public static int rolaD8() {
		Random gera = new Random();
        int num = 0;
        while(num < 1) {
        	num = gera.nextInt(9);
        }
		return num;
	}
	
	public static int rolaD10() {
		Random gera = new Random();
        int num = 0;
        while(num < 1) {
        	num = gera.nextInt(11);
        }
		return num;
	}
	
	public static int rolaD12() {
		Random gera = new Random();
        int num = 0;
        while(num < 1) {
        	num = gera.nextInt(13);
        }
		return num;
	}
	
	public static int rolaD20() {
		Random gera = new Random();
        int num = 0;
        while(num < 1) {
        	num = gera.nextInt(21);
        }
		return num;
	}
	
	public static int rolaD100() {
		Random gera = new Random();
        int num = -1;
        while(num < 0) {
        	num = gera.nextInt(100);
        }
		return num;
	}
}
