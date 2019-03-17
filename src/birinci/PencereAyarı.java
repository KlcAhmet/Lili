package birinci;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PencereAyarı
  {
    private DosyaBulma dosyaBulma;
    private int[] seçimler = {7, 7, 7, 7, 7, 7, 7};

    public PencereAyarı(LiliFrm LF)
      {
        comboBoxEvent(LF);
        aktarButonuAyarı(LF);

      }


    private void comboBoxEvent(LiliFrm LF)   //CheckBoxListener Bölümü
    {
      LF.ResimCheckBox.addItemListener(new ItemListener()
        {
          @Override
          public void itemStateChanged(ItemEvent e)
            {
              if (LF.ResimCheckBox.isSelected())
                {
                  seçimler[0] = 0;
                  LF.textAreaSet("Resim seçildi.");
                }
              else
                {
                  seçimler[0] = 7;
                  LF.textAreaSet("Resim seçimden Kaldırıldı.");
                }
            }
        });


      LF.ArsivCheckBox.addItemListener(new ItemListener()
        {
          @Override
          public void itemStateChanged(ItemEvent e)
            {
              if (LF.ArsivCheckBox.isSelected())
                {
                  seçimler[1] = 1;
                  LF.textAreaSet("Arşiv seçildi.");
                }
              else
                {
                  seçimler[1] = 7;
                  LF.textAreaSet("Arşiv seçimden kaldırıldı.");
                }
            }
        });


      LF.SesCheckBox.addItemListener(new ItemListener()
        {
          @Override
          public void itemStateChanged(ItemEvent e)
            {
              if (LF.SesCheckBox.isSelected())
                {
                  seçimler[2] = 2;
                  LF.textAreaSet("Ses seçildi.");
                }
              else
                {
                  seçimler[2] = 7;
                  LF.textAreaSet("Ses seçimden kaldırıldı.");
                }
            }
        });


      LF.DeveloperCheckBox.addItemListener(new ItemListener()
        {
          @Override
          public void itemStateChanged(ItemEvent e)
            {
              if (LF.DeveloperCheckBox.isSelected())
                {
                  seçimler[3] = 3;
                  LF.textAreaSet("Developer seçildi.");
                }
              else
                {
                  seçimler[3] = 7;
                  LF.textAreaSet("Developer seçimden kaldırıldı.");
                }
            }
        });

      LF.DocumentCheckBox.addItemListener(new ItemListener()
        {
          @Override
          public void itemStateChanged(ItemEvent e)
            {
              if (LF.DocumentCheckBox.isSelected())
                {
                  seçimler[4] = 4;
                  LF.textAreaSet("Document seçildi");
                }
              else
                {
                  seçimler[4] = 7;
                  LF.textAreaSet("Document seçimden kaldırıldı.");
                }
            }
        });

      LF.VideoCheckBox.addItemListener(new ItemListener()
        {
          @Override
          public void itemStateChanged(ItemEvent e)
            {
              if (LF.VideoCheckBox.isSelected())
                {
                  seçimler[5] = 5;
                  LF.textAreaSet("Video seçildi");
                }
              else
                {
                  seçimler[5] = 7;
                  LF.textAreaSet("Video seçimden kaldırıldı.");
                }
            }
        });


    }


    private void aktarButonuAyarı(LiliFrm LF)
      {
        LF.AktarButton.addItemListener(new ItemListener()
          {
            @Override
            public void itemStateChanged(ItemEvent e)
              {
                if (LF.AktarButton.isSelected())
                  {
                    boolean aktiflik = false;

                    for (int i : seçimler)
                      {
                        if (i != 7)
                          {
                            aktiflik = true;
                            break;
                          }
                        else
                          {
                            aktiflik = false;
                          }
                      }

                    if (aktiflik == true)
                      {
                        Thread thread = new Thread(new Runnable() // JFrame donmaması için zorunlu thread
                          {
                            @Override
                            public void run()
                              {
                                dosyaBulma = new DosyaBulma(LF);
                                LF.AktarButton.setEnabled(false);
                                LF.textAreaSet("------------------------------------------------- Filtre başladı -------------------------------------------------");
                                dosyaBulma.çokluFormatSeçim(seçimler);
                                LF.setProgressbar(100);
                              }
                          });
                        thread.start();

                      }
                    else
                      {
                        LF.textAreaSet("Filtre seçimi Yapılmadı");
                        LF.AktarButton.setSelected(false);

                      }

                  }
              }
          }
        );
      }

  }
