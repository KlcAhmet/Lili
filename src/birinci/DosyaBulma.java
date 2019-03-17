package birinci;

import java.io.File;
import java.util.ArrayList;

public class DosyaBulma
  {
    private DosyaFormat dosyaFormat;
    private File file;
    private String liliDizin; // lili.exe veya lili.jar bulunduğu dizin
    private ArrayList<String> rootDisk; // root disklerin bulunduğu dizin
    protected ArrayList<String> dosyaDizinleri; // klasör, alt klasör ve dosyaların dizin yollarını barındırıyor

    protected DosyaBulma(LiliFrm LF)
      {
        rootDisk = new ArrayList<String>();
        dosyaDizinleri = new ArrayList<String>();
        dosyaFormat = new DosyaFormat(LF);

        kökDosyaBul(LF);  // Kök diskleri bulan metod
        LiliBulucu(LF);   //Lili Bulucu


        LF.textAreaSet("------------------------->Filtre Başlatılmayı Bekliyor");
        LF.setProgressbar(20);
      }


    private void kökDosyaBul(LiliFrm LF) // Kök diskleri bulan metod
    {
      File[] kökdosyalar;
      LF.textAreaSet("------------------------->DOSYA ARAŞTIRMASI BAŞLADI");

      try
        {
          kökdosyalar = File.listRoots();  // return verisi "C:\" şeklinde
          for (File file : kökdosyalar)
            {
              rootDisk.add(file.toString());
            }
        }
      catch (Exception e)
        {
          e.printStackTrace();
        }

      LF.textAreaSet("------------------------->BULUNAN ROOT DİSK: " + rootDisk.size());
      int rootDiskBoyut = rootDisk.size();
      int durum = 1;

      for (String st : rootDisk)
        {
          LF.textAreaSet("------------------------->Durum: " + rootDiskBoyut + "/" + durum);
          file = new File(st);
          dosyaPath(file);
          durum++;
        }
    }


    private void dosyaPath(File dosyaYol) // recursive metod ile dosyaları bulma
    {
      // Tarama yapılmayacak dizinler
      final String programFiles = "Program Files";
      final String programFilesX86 = "Program Files (x86)";
      final String programFiles2X86 = "Program Dosyaları (x86)";
      final String programData = "ProgramData";
      final String windows = "Windows";
      final String usersDefault = "Users\\Default";
      final String usersPublic = "Users\\Public";
      final String appData = "AppData";
      final String allUsers = "All Users";
      //

      if (dosyaYol.exists() && dosyaYol.isDirectory())
        {
          try
            {
              for (File subdir : dosyaYol.listFiles())
                {

                  if (subdir.isDirectory())
                    {
                      String yol = subdir.toString();
                      if (yol.indexOf(allUsers) != -1 || yol.indexOf(appData) != -1 || usersPublic.equals(yol.substring(3)) || programFiles.equals(yol.substring(3)) || programFilesX86.equals(yol.substring(3)) || programFiles2X86.equals(yol.substring(3)) || programData.equals(yol.substring(3)) || windows.equals(yol.substring(3)) || usersDefault.equals(yol.substring(3)))
                        {
                          continue;
                        }
                      else
                        {
                          dosyaPath(subdir);

                        }

                    }
                  else
                    {
                      dosyaDizinleri.add(subdir.getAbsolutePath());

                    }
                }

            }
          catch (Exception e)
            {

            }

        }
    }

    private void LiliBulucu(LiliFrm LF)  // Lili.jar dosyasını bulur. "stl" klasörünün yanına yaratmak için.
    {
      File file2;
      for (String string : rootDisk)
        {
          file2 = new File(string + "LiliV2.exe");
          file = new File(string + "LiliV2.jar");
          if (file.exists())
            {
              liliDizin = file.getParent();
              dosyaFormat.dizin = liliDizin;
              LF.textAreaSet("------------------------->Lili bulundu: " + liliDizin);
              dosyaFormat.LiliDizin();

            }
          else if (file2.exists())
            {
              liliDizin = file.getParent();
              dosyaFormat.dizin = liliDizin;
              LF.textAreaSet("------------------------->Lili bulundu: " + liliDizin);
              dosyaFormat.LiliDizin();
            }
          else
            {

            }
        }
    }


    public void formatSeçim(int selec)  // pencereAyarı sınıfdan "seçimler" veri tipinden gönderilen parametrelere göre formatları çağığır
    {
      switch (selec)
        {
          case 0:
            dosyaFormat.resimFormatı(dosyaDizinleri);
            break;
          case 1:
            dosyaFormat.arsivFormatı(dosyaDizinleri);
            break;
          case 2:
            dosyaFormat.sesFormatı(dosyaDizinleri);
            break;
          case 3:
            dosyaFormat.developerFormatı(dosyaDizinleri);
            break;
          case 4:
            dosyaFormat.documentFormatı(dosyaDizinleri);
            break;
          case 5:
            dosyaFormat.videoFormatı(dosyaDizinleri);
            break;
          case 6:
            dosyaFormat.arraylistBoşalt();
            break;
          default:
            break;

        }
    }

    public void çokluFormatSeçim(int[] selec) // pencereAyarı sınıfdan "seçimler" veri tipinden gönderilen parametrelere göre formatları çağığır >> formatSeçim metoduna
    {

      for (int i : selec)
        {
          if (i >= 0 && i <= 6)
            {

              formatSeçim(i);
              formatSeçim(6);
            }
        }
    }
  }
