import java.util.LinkedList;


public class BFS {
    
	
	public static LinkedList<Cell> EKY(int[][] matrix, int[] Baslangıc, int[] Bitis) {
		int xbas = Baslangıc[0], ybas = Baslangıc[1];
		int xson = Bitis[0], yson = Bitis[1];	
		
		
	    int m = matrix.length;
	    int n = matrix[0].length;	    
	    Cell[][] cells = new Cell[m][n];
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (matrix[i][j] == 0) {
	                cells[i][j] = new Cell(i, j,100,"bos", null);
	            }
	        }
	    }
	    
	    LinkedList<Cell> kuyruk = new LinkedList<>();       
	    Cell ilk = cells[xbas][ybas];
	    ilk.mesafe = 0;
	    kuyruk.add(ilk);
	    Cell son = null;
	    Cell p;
	    while ((p = kuyruk.poll()) != null) {
	    	
	        if (p.x == xson && p.y == yson) { 
	            son = p;
	            break;
	        } 
	        gidildi_mi(cells, kuyruk, p.x - 1, p.y, p); 
	        gidildi_mi(cells, kuyruk, p.x + 1, p.y, p); 
	        gidildi_mi(cells, kuyruk, p.x, p.y - 1, p);  
	        gidildi_mi(cells, kuyruk, p.x, p.y + 1, p);
	    }
	    
	   
	    if (son != null) {
	        LinkedList<Cell> yol = new LinkedList<>();
	        p = son;
	        do {
	            yol.addFirst(p);
	        } while ((p = p.Ana_cell) != null);
	        
	        return yol;
	    }
	    return null;
	}
	
	
	private static void gidildi_mi(Cell[][] cells, LinkedList<Cell> kuyruk, int x, int y, Cell Ana_cell) { 
		
	    if (x < 0 || x >= cells.length || y < 0 || y >= cells[0].length || cells[x][y] == null) {
	        return;
	    }    
	    
	    int mesafe = Ana_cell.mesafe + 1;
	    Cell p = cells[x][y];
	    
	    if (mesafe < p.mesafe) {
	        p.mesafe = mesafe;
	        p.Ana_cell = Ana_cell;
	        kuyruk.add(p);
	    }
	    
	}
}
