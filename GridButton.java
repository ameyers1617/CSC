import javax.swing.JButton;
public class GridButton extends JButton
{
   private int row;
   private int column;
   
   public GridButton(String title, int newRow, int newColumn)
   {
      super( title );
      setRow( newRow );
      setColumn( newColumn );
   }
   public int getRow()
   {
      return row;
   }   
   public int getColumn()
   {
      return column;
   }
   public void setRow( int newRow )
   {
      if( newRow >= 0 )
         row = newRow;
   }
   public void setColumn( int newColumn )
   {
      if( newColumn >= 0 )
         column = newColumn;
   }
}   