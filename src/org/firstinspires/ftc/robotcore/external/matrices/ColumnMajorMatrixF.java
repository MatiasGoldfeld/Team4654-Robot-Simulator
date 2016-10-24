/*    */ package org.firstinspires.ftc.robotcore.external.matrices;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ColumnMajorMatrixF
/*    */   extends DenseMatrixF
/*    */ {
/*    */   public ColumnMajorMatrixF(int nRows, int nCols)
/*    */   {
/* 44 */     super(nRows, nCols);
/*    */   }
/*    */   
/*    */   protected int indexFromRowCol(int row, int col)
/*    */   {
/* 49 */     return col * this.numRows + row;
/*    */   }
/*    */   
/*    */   public VectorF toVector()
/*    */   {
/* 54 */     return new VectorF(getData());
/*    */   }
/*    */ }


/* Location:              C:\Users\exploravision\Desktop\RobotCore-release.jar!\classes.jar!\org\firstinspires\ftc\robotcore\external\matrices\ColumnMajorMatrixF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */