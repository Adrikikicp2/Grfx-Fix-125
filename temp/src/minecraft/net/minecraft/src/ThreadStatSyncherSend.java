package net.minecraft.src;

import java.util.Map;
import net.minecraft.src.StatsSyncher;

class ThreadStatSyncherSend extends Thread {

   // $FF: synthetic field
   final Map field_27233_a;
   // $FF: synthetic field
   final StatsSyncher field_27232_b;


   ThreadStatSyncherSend(StatsSyncher p_i523_1_, Map p_i523_2_) {
      this.field_27232_b = p_i523_1_;
      this.field_27233_a = p_i523_2_;
   }

   public void run() {
      try {
         StatsSyncher.func_27412_a(this.field_27232_b, this.field_27233_a, StatsSyncher.func_27414_e(this.field_27232_b), StatsSyncher.func_27417_f(this.field_27232_b), StatsSyncher.func_27419_g(this.field_27232_b));
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         StatsSyncher.func_27416_a(this.field_27232_b, false);
      }

   }
}
