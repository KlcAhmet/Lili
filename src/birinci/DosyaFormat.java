package birinci;

import java.util.ArrayList;

public class DosyaFormat
  {
    private LiliFrm LFdF;
    private DosyaAktarma dosyaAktarma;
    private ArrayList<String> dosyaYol;
    protected String dizin;

    // Resim formatları
    private final String[] resimFormat = new String[]
            {
                    ".tif", ".tiff", ".bmp", ".jpg", ".jpeg", ".gif", ".png", ".eps", ".raw", ".cr2"
            };
    // Arşiv formatları
    private final String[] arsivFormat = new String[]
            {
                    ".7z", ".gz", ".gzip", ".rar", ".zip", ".zipx"
            };
    // Ses formatları
    private final String[] sesFormat = new String[]
            {
                    ".3ga", ".aa", ".aac", ".m4a", "mp2", ".mp3", ".flac", ".wav"
            };
    // Developer formatları
    private final String[] developerFormat = new String[]
            {
                    ".c", ".cpp", ".java"
            };
    // Document
    private final String[] documentFormat = new String[]
            {
                    ".doc", ".docx", ".dot", ".log", ".msg", ".pdf", ".txt", ".pps", ".ppsx", ".ppt", ".pptm", ".pptx"
            };
    // Video formatları
    private static String[] videoFormat = new String[]
            {
                    ".3gpp", ".avi", ".f4v", ".flv", ".m4v", ".mov", ".mp4", "mpeg"
            };

    //
    protected DosyaFormat(LiliFrm LF)
      {
        dosyaYol = new ArrayList<String>();
        dosyaAktarma = new DosyaAktarma(LF);
        LF.setProgressbar(50);
        LFdF = LF;
      }


    public void resimFormatı(ArrayList<String> yol)
      {
        int kalan = 0;
        try
          {
            for (String ayrılacak : yol)
              {
                String format3 = ayrılacak.substring(ayrılacak.length() - 4, ayrılacak.length());
                String format4 = ayrılacak.substring(ayrılacak.length() - 5, ayrılacak.length());
                for (String string : resimFormat)
                  {
                    if (string.equalsIgnoreCase(format3) || string.equalsIgnoreCase(format4))
                      {
                        dosyaYol.add(ayrılacak);
                        kalan++;
                      }
                  }
              }
            LFdF.textAreaSet("Resim verileri kopyalanıyor... Kopyalanacak sayı= " + kalan);
            for (String string : dosyaYol)
              {
                dosyaAktarma.dosyaAktar(string);
                LFdF.textAreaSet("Kalan resim= " + kalan);
                kalan--;
              }
          }
        catch (Exception e)
          {
            e.printStackTrace();
          }

      }

    public void arsivFormatı(ArrayList<String> yol)
      {
        int kalan = 0;
        try
          {
            for (String ayrılacak : yol)
              {
                String format3 = ayrılacak.substring(ayrılacak.length() - 4, ayrılacak.length());
                String format4 = ayrılacak.substring(ayrılacak.length() - 5, ayrılacak.length());
                for (String string : arsivFormat)
                  {
                    if (string.equalsIgnoreCase(format3) || string.equalsIgnoreCase(format4))
                      {
                        dosyaYol.add(ayrılacak);
                        kalan++;
                      }
                  }
              }
            LFdF.textAreaSet("Arşiv verileri kopyalanıyor... Kopyalanacak sayı= " + kalan);
            for (String string : dosyaYol)
              {
                dosyaAktarma.dosyaAktar(string);
                LFdF.textAreaSet("Kalan arşiv= " + kalan);
                kalan--;
              }
          }
        catch (Exception e)
          {
          }

      }

    public void sesFormatı(ArrayList<String> yol)
      {
        int kalan = 0;
        try
          {
            for (String ayrılacak : yol)
              {
                String format3 = ayrılacak.substring(ayrılacak.length() - 4, ayrılacak.length());
                String format4 = ayrılacak.substring(ayrılacak.length() - 5, ayrılacak.length());
                for (String string : sesFormat)
                  {
                    if (string.equalsIgnoreCase(format3) || string.equalsIgnoreCase(format4))
                      {
                        dosyaYol.add(ayrılacak);
                        kalan++;
                      }
                  }
              }
            LFdF.textAreaSet("Ses verileri kopyalanıyor... Kopyalanacak sayı= " + kalan);
            for (String string : dosyaYol)
              {
                dosyaAktarma.dosyaAktar(string);
                LFdF.textAreaSet("Kalan ses= " + kalan);
                kalan--;
              }
          }
        catch (Exception e)
          {
          }

      }

    public void developerFormatı(ArrayList<String> yol)
      {
        int kalan = 0;
        try
          {
            for (String ayrılacak : yol)
              {
                String format3 = ayrılacak.substring(ayrılacak.length() - 4, ayrılacak.length());
                String format4 = ayrılacak.substring(ayrılacak.length() - 5, ayrılacak.length());
                for (String string : developerFormat)
                  {
                    if (string.equalsIgnoreCase(format3) || string.equalsIgnoreCase(format4))
                      {
                        dosyaYol.add(ayrılacak);
                        kalan++;
                      }
                  }
              }
            LFdF.textAreaSet("Developer verileri kopyalanıyor... Kopyalanacak sayı= " + kalan);
            for (String string : dosyaYol)
              {
                dosyaAktarma.dosyaAktar(string);
                LFdF.textAreaSet("Kalan developer= " + kalan);
                kalan--;
              }
          }
        catch (Exception e)
          {
          }

      }

    public void documentFormatı(ArrayList<String> yol)
      {
        int kalan = 0;
        try
          {
            for (String ayrılacak : yol)
              {
                String format3 = ayrılacak.substring(ayrılacak.length() - 4, ayrılacak.length());
                String format4 = ayrılacak.substring(ayrılacak.length() - 5, ayrılacak.length());
                for (String string : documentFormat)
                  {
                    if (string.equalsIgnoreCase(format3) || string.equalsIgnoreCase(format4))
                      {
                        dosyaYol.add(ayrılacak);
                        kalan++;
                      }
                  }
              }
            LFdF.textAreaSet("Document verileri kopyalanıyor... Kopyalanacak sayı= " + kalan);
            for (String string : dosyaYol)
              {
                dosyaAktarma.dosyaAktar(string);
                LFdF.textAreaSet("Kalan document= " + kalan);
                kalan--;
              }
          }
        catch (Exception e)
          {
          }

      }

    public void videoFormatı(ArrayList<String> yol)
      {
        int kalan = 0;
        try
          {
            for (String ayrılacak : yol)
              {
                String format3 = ayrılacak.substring(ayrılacak.length() - 4, ayrılacak.length());
                String format4 = ayrılacak.substring(ayrılacak.length() - 5, ayrılacak.length());
                for (String string : videoFormat)
                  {
                    if (string.equalsIgnoreCase(format3) || string.equalsIgnoreCase(format4))
                      {
                        dosyaYol.add(ayrılacak);
                        kalan++;
                      }
                  }
              }
            LFdF.textAreaSet("Video verileri kopyalanıyor... Kopyalanacak sayı= " + kalan);
            for (String string : dosyaYol)
              {
                dosyaAktarma.dosyaAktar(string);
                LFdF.textAreaSet("Kalan video= " + kalan);
                kalan--;
              }
          }
        catch (Exception e)
          {
          }

      }

    public void arraylistBoşalt() // dosyaYol temizler
    {
      if (dosyaYol.isEmpty())
        {

        }
      else
        {
          dosyaYol.clear();
        }
    }

    public void LiliDizin()
      {
        dosyaAktarma.klasörYarat(dizin);
      }
  }
