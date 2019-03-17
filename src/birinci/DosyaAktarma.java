package birinci;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DosyaAktarma
  {
    private LiliFrm LFdA;
    private File file;
    private File file2;
    private String hedefKlasör;

    public DosyaAktarma(LiliFrm LF)
      {
        LFdA = LF;
      }


    protected void klasörYarat(String dizin)   // dosyaların aktarılacağı klasörü yaratan metod. "slt" klasörü
    {
      try
        {
          this.hedefKlasör = dizin + "stl";
          file = new File(dizin + "stl");
          LFdA.textAreaSet("------------------------->Kopyalanacak klasör adresi: " + file.toPath());
          file.mkdirs();
          if (file.exists())
            {
              LFdA.textAreaSet("------------------------->stl oluşturuldu");
            }
          else
            {
              LFdA.textAreaSet("------------------------->stl oluşturulamadı");
            }

        }
      catch (Exception e)
        {
          e.printStackTrace();
        }
    }

    protected void dosyaAktar(String kaynakDosya) // Dosyaları "stl" klasörüne kopyalayan metod
    {
      try
        {
          file = new File(kaynakDosya);
          FileInputStream copy = new FileInputStream(file);
          byte[] bb = new byte[(int) file.length()];
          copy.read(bb);

          file2 = new File(hedefKlasör + File.separator + file.getName());
          file.createNewFile();
          FileOutputStream paste = new FileOutputStream(file2);
          paste.write(bb);
          LFdA.textAreaSet("Kopyalandı: " + file.getPath());

          copy.close();
          paste.close();


        }
      catch (Exception e)
        {
          e.getMessage();
          e.printStackTrace();
        }

    }

  }
