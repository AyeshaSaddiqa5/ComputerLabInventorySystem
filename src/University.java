public class University {
   private Lab[] labs;

   public void addLab(Lab lab) {
      for (int i = 0; i < labs.length; i++) {
         if (labs[i] == null) {
            labs[i] = lab;
            return;
         }
      }
      System.out.println("no limit");
   }
   public void removeLab(String labID) {
      for (int i = 0; i < labs.length; i++) {
         if (labs[i] != null) {
            labs[i] = null;
            return;
         }
      }
      System.out.println("Lab not.");
   }
   public Lab fetchLab(String labID) {
      for (Lab lab : labs) {
         if (lab != null) {
            return lab;
         }
      }
      return null;
   }
}
