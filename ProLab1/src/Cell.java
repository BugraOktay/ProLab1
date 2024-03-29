
public  class Cell  {
        int x;
        int y;
        int mesafe; 
        String ad;
        Cell Ana_cell;  
        Cell(int x, int y, int mesafe,String ad, Cell Ana_cell) {
            this.x = x;
            this.y = y;
            this.mesafe = mesafe;
            this.ad=ad;
            this.Ana_cell = Ana_cell;
        }
        
        Cell(int x, int y) {
            this.x = x;
            this.y = y;
            
        }
        
    }