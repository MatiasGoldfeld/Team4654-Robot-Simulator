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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DenseMatrixF
/*    */   extends MatrixF
/*    */ {
/*    */   protected DenseMatrixF(int nRows, int nCols)
/*    */   {
/* 48 */     super(nRows, nCols);
/*    */   }
/*    */   
/*    */   public float get(int row, int col)
/*    */   {
/* 53 */     return getData()[indexFromRowCol(row, col)];
/*    */   }
/*    */   
/*    */   public void put(int row, int col, float value)
/*    */   {
/* 58 */     getData()[indexFromRowCol(row, col)] = value;
/*    */   }
/*    */   
/*    */   public abstract float[] getData();
/*    */   
/*    */   protected abstract int indexFromRowCol(int paramInt1, int paramInt2);
/*    */ }


/* Location:              C:\Users\exploravision\Desktop\RobotCore-release.jar!\classes.jar!\org\firstinspires\ftc\robotcore\external\matrices\DenseMatrixF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */