import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Random;
import java.util.Arrays;
import java.util.LinkedList;

class Labirent {
    
    private Stack<Cell> stack = new Stack<>();
    
    private int[][] labirent;
    private int boyut_m;
    private int boyut_n;
    
    Labirent(int m, int n) {
        labirent = new int[m][n];
        boyut_m = m;
        boyut_n = n;
    }

    public void labirent_yap() {
        stack.push(new Cell(0,0));
        while (!stack.empty()) { 
            Cell next = stack.pop();
            if (Yol_yap(next)) {
                labirent[next.y][next.x] = 1;
                ArrayList<Cell> komsu = Komsu_bul(next);
                Sonraki_yol(komsu);
            }
        }
    }

    public int[][] labirent_don() {


        return labirent;
    }
    
    public void labirent_ciz(JPanel panel,int [][]matris) {
    	int b=5;
		int konumx=0;
		int konumy=0;
		
		Image resim1 = new ImageIcon(this.getClass().getResource("kutu.png")).getImage();
		Image resim2 = new ImageIcon(this.getClass().getResource("kutu2.png")).getImage();
		
		
		
		
		
		for(int i=0;i<boyut_m;i++) {
			int a=5;
			
			
			for(int j=0;j<boyut_n;j++) {
				sayi.lbL2[konumy][konumx]= new JLabel("");
				sayi.lbL2[konumy][konumx].setBounds(a, b, 20, 20);
				panel.add(sayi.lbL2[konumy][konumx]);
				
				
				if(matris[i][j]==0) {
					sayi.lbL2[konumy][konumx].setIcon(new ImageIcon(resim1)); //siyah
					sayi.lbL2[konumy][konumx].setName("s");
					}
				else {
					sayi.lbL2[konumy][konumx].setIcon(new ImageIcon(resim2)); //beyaz
					sayi.lbL2[konumy][konumx].setName("b");
				}
				
				konumx++;
				a+=21;
			}
			
			
			b+=21;
			konumy++;
			konumx=0;
		}
		
		
    }
    public LinkedList<Cell> labirent_calitir() {
    	Image resim3 = new ImageIcon(this.getClass().getResource("mavi.png")).getImage();
    	LinkedList<Cell> stack = new LinkedList<>(); 
    	Cell ilk = new Cell(0, 0);
    	Cell son = new Cell(boyut_m-1,boyut_n-1);
    	sayi.lbL2[0][0].setIcon(new ImageIcon(resim3));
    	sayi.lbL2[0][0].setName("m");
    	stack.add(ilk);
    	int k=0;
    	
    	Cell[][] cells = new Cell[boyut_m][boyut_n];
	    for (int i = 0; i < boyut_m; i++) {
	        for (int j = 0; j < boyut_n; j++) {
	            
	                cells[i][j] = new Cell(i, j, 100,"bos" ,null);
	            
	        }
	    }
	    
	    
			
			
	    
	    
    	while(k<500) {
    		
    		
    		if(ilk.x==son.x && ilk.y==son.y)
    			break;
    		
    		
    		if(ilk.x>=0 && ilk.y+1>=0 &&sayi.lbL2[ilk.x][ilk.y+1]!=null && sayi.lbL2[ilk.x][ilk.y+1].getName().equals("b") ) {//SAĞ
    			stack.addFirst(cells[ilk.x][ilk.y+1]);
    			ilk.y+=1;
    			sayi.lbL2[ilk.x][ilk.y].setName("m");
    			sayi.lbL2[ilk.x][ilk.y].setIcon(new ImageIcon(resim3));
    			System.out.print("1");
    		}
    		else if(ilk.x>=0 && ilk.y-1>=0 && sayi.lbL2[ilk.x][ilk.y-1]!=null &&sayi.lbL2[ilk.x][ilk.y-1].getName().equals("b")) {//SOL
    			stack.addFirst(cells[ilk.x][ilk.y-1]);
    			ilk.y-=1;
    			sayi.lbL2[ilk.x][ilk.y].setName("m");
    			sayi.lbL2[ilk.x][ilk.y].setIcon(new ImageIcon(resim3));
    			System.out.print("2");
    		}
    		else if(ilk.x+1>=0 && ilk.y>=0 &&sayi.lbL2[ilk.x+1][ilk.y]!=null && sayi.lbL2[ilk.x+1][ilk.y].getName().equals("b")) {//aşağı
    			stack.addFirst(cells[ilk.x+1][ilk.y]);
    			ilk.x+=1;
    			sayi.lbL2[ilk.x][ilk.y].setName("m");
    			sayi.lbL2[ilk.x][ilk.y].setIcon(new ImageIcon(resim3));
    			System.out.print("3");
    		}
    		else if(ilk.x-1>=0 && ilk.y>=0 &&sayi.lbL2[ilk.x-1][ilk.y]!=null && sayi.lbL2[ilk.x-1][ilk.y].getName().equals("b")) {//yukarı
    			stack.addFirst(cells[ilk.x-1][ilk.y]);
    			ilk.x-=1;
    			sayi.lbL2[ilk.x][ilk.y].setName("m");
    			sayi.lbL2[ilk.x][ilk.y].setIcon(new ImageIcon(resim3));
    			System.out.print("4");
    		}
    		
    		else {
    			System.out.print("5");
    			
	        	ilk=stack.poll();
    			
    			
    		}
    		
    		k++;
    	}
    	System.out.println();
    	return stack;
    	
    }
    

    private boolean Yol_yap(Cell cell) {
        int a = 0;
        for (int y = cell.y-1; y < cell.y+2; y++) {
            for (int x = cell.x-1; x < cell.x+2; x++) {
                if (sinir_kontrol(x, y) && !(x == cell.x && y == cell.y) && labirent[y][x] == 1) {
                    a++;
                }
            }
        }
        return (a < 3) && labirent[cell.y][cell.x] != 1;
    }

    private void Sonraki_yol(ArrayList<Cell> cells) {
    	Random r = new Random();
        int x;
        while (!cells.isEmpty()) {
            x = r.nextInt(cells.size());
            stack.push(cells.remove(x));
        }
    }

    private ArrayList<Cell> Komsu_bul(Cell cell) {
        ArrayList<Cell> komsu = new ArrayList<>();
        for (int y = cell.y-1; y < cell.y+2; y++) {
            for (int x = cell.x-1; x < cell.x+2; x++) {
                if (sinir_kontrol(x, y) && (x == cell.x || y == cell.y) && !(x == cell.x && y == cell.y)) {
                    komsu.add(new Cell(x, y));
                }
            }
        }
        return komsu;
    }

    private Boolean sinir_kontrol(int x, int y) {
        return x >= 0 && y >= 0 && x < boyut_n && y < boyut_m;
    }

   
}

