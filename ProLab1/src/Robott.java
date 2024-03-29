import java.awt.Image;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Robott {

	public static LinkedList<Cell> Hareket(int[][] matris,int[] Baslangıc, int[] Bitis, Image resim){
		
		int xbas = Baslangıc[0], ybas = Baslangıc[1];
		int xson = Bitis[0], yson = Bitis[1];	
		
		int m = matris.length;
	    int n = matris[0].length;	    
	    Cell[][] cells = new Cell[m][n];
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (matris[i][j] == 0) {
	                cells[i][j] = new Cell(i, j, 100,"bos" ,null);
	            }
	        }
	    }
		
	    LinkedList<Cell> kuyruk = new LinkedList<>();   
	    LinkedList<Cell> kuyruk1 = new LinkedList<>(); 
	    Cell ilk = cells[xbas][ybas];
	    //sayi.lbL[xbas][ybas].setIcon(new ImageIcon(resim));
	    sayi.lbL[xbas][ybas].setName("m");
	    kuyruk.add(ilk);
	    kuyruk1.add(ilk);
	    Cell son = null;
	    Cell p = ilk;
			
	    while (true) {
	    	if(p==null)
	    		break;
	        if ((p.x == xson && p.y == yson)||(p.x+1 == xson && p.y == yson)||(p.x-1 == xson && p.y == yson)||(p.x == xson && p.y+1 == yson)||(p.x == xson && p.y-1 == yson)) { 
	        	break;} 
	        int i=1;	
	        int w=0;int s=0; int d=0;int a=0;
	        if(yol_var_mi(cells, p.x - 1, p.y,p)) {w=i;i++;}
	        if(yol_var_mi(cells, p.x + 1, p.y,p)) {s=i;i++;}
	        if(yol_var_mi(cells, p.x, p.y-1,p)) {a=i;i++;}
	        if(yol_var_mi(cells, p.x, p.y+1,p)) {d=i;}
	        
	        Random r=new Random();
	        int rand=r.nextInt(i)+1;
	        
	        if(rand==w) {
	        	//sayi.lbL[p.x-1][p.y].setIcon(new ImageIcon(resim));
	        	p=cells[p.x-1][p.y];
	        	kuyruk.addFirst(p);
	        	kuyruk1.addFirst(p);
	        	sayi.lbL[p.x][p.y].setName("m");
	        	
	        }
	        else if(rand==s) {
	        	//sayi.lbL[p.x+1][p.y].setIcon(new ImageIcon(resim));
	        	p=cells[p.x+1][p.y];
	        	kuyruk.addFirst(p);
	        	kuyruk1.addFirst(p);
	        	sayi.lbL[p.x][p.y].setName("m");
	        }
	        else if(rand==a) {
	        	//sayi.lbL[p.x][p.y-1].setIcon(new ImageIcon(resim));
	        	p=cells[p.x][p.y-1];
	        	kuyruk.addFirst(p);
	        	kuyruk1.addFirst(p);
	        	sayi.lbL[p.x][p.y].setName("m");
	        }
	        else if(rand==d) {
	        	//sayi.lbL[p.x][p.y+1].setIcon(new ImageIcon(resim));
	        	p=cells[p.x][p.y+1];
	        	kuyruk.addFirst(p);
	        	kuyruk1.addFirst(p);
	        	sayi.lbL[p.x][p.y].setName("m");
	        }
	        if(a==0 && s==0 && a==0 && w==0) {
	        	p=kuyruk.poll();
	        	if(kuyruk1.getFirst()!=p)
	        		kuyruk1.addFirst(p);
	        }
	        
	    }
	    
	    return kuyruk1;
	    
		
	}
	
	public static boolean yol_var_mi(Cell[][] cells, int x, int y, Cell p)  {
		
		if(x < 0 || x >= cells.length || y < 0 || y >= cells[0].length || cells[x][y] == null ||sayi.lbL[x][y]==null|| sayi.lbL[x][y].getName()=="s" || sayi.lbL[x][y].getName().equals("m"))
			return false;
		
		
			
		return true;
	}
}
