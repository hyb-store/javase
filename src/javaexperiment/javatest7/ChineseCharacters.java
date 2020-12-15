//package javaexperiment.javatest7;
///*
//编写一个Java应用程序，要求如下：
//（1）可以将一个由汉字字符组成的文本文件读入到程序中；
//（2）单击名为“下一个汉字”的按钮，可以在一个标签中显示程序读入的一个汉字；
//（3）单击名为“发音”的按钮，可以听到标签上显示的汉字的读音。
//（4）用户可以使用文本编辑器编辑程序中用到的3个由汉字字符组成的文本文件：training1.txt、training2.txt和training.txt，
//    这些文本文件中的汉字需要用空格、逗号或回车分隔。
//（5）需要自己制作相应的声音文件，比如：training1.txt文件包含汉字“你”，那么在当前应用程序的运行目录中需要有“你.wav”格式的声音文件。
//（6）用户选择“帮助”菜单，可以查看软件的帮助信息。
// */
//import java.awt.*;
//import java.awt.event.*;
//import java.io.*;
//import javax.sound.sampled.*;
//import java.io.*;
//import java.util.StringTokenizer;
//public class ChineseCharacters {
//    public StringBuffer getChinesecharacters(File file) {
//    StringBuffer hanzi = new StringBuffer();
//    try {
//        FileReader inOne = new FileReader();  //创建指向文件f的inOne 的对象
//        BufferedReader inTwo =new BufferedReader(inOne);//创建指向文件inOne的inTwo的对象
//        String s = null;
//        int i = 0;
//        while ((s =【代码3】)!=null)                 //inTwo读取一行
//        {
//            StringTokenizer tokenizer = new StringTokenizer(s, " ,'\n' ");
//            while (tokenizer.hasMoreTokens()) {
//                hanzi.append(tokenizer.nextToken());
//            }
//        }
//    } catch (Exception e) {
//    }
//    return hanzi;
//    }
//}
//
//
//
//public class StudyFrame extends Frame implements ItemListener,ActionListener,Runnable {
//    ChineseCharacters chinese;
//    Choice choice;
//    Button getCharacters,voiceCharacters;
//    Label showCharacters;
//    StringBuffer trainedChinese=null;
//    Clip clip=null;
//    Thread voiceThread;
//    int k=0;
//    Panel pCenter;
//    CardLayout mycard;
//    TextArea textHelp;
//    MenuBar menubar;
//    Menu menu;
//    MenuItem help;
//    public StudyFrame() {
//        chinese=new ChineseCharacters();
//        choice=new Choice();
//        choice.add("training1.txt");
//        choice.add("training2.txt");
//        choice.add("training3.txt");
//        showCharacters=new Label("",Label.CENTER);
//        showCharacters.setFont(new Font("宋体",Font.BOLD,72));
//        showCharacters.setBackground(Color.green);
//        getCharacters=new Button("下一个汉字");
//        voiceCharacters=new Button("发音");
//        voiceThread=new Thread(this);
//        choice.addItemListener(this);
//        voiceCharacters.addActionListener(this);
//        getCharacters.addActionListener(this);
//        Panel pNorth=new Panel();
//        pNorth.add(new Label("选择一个汉字字符组成的文件"));
//        pNorth.add(choice);
//        add(pNorth,BorderLayout.NORTH);
//        Panel pSouth=new Panel();
//        pSouth.add(getCharacters);
//        pSouth.add(voiceCharacters);
//        add(pSouth,BorderLayout.SOUTH);
//        pCenter=new Panel();
//        mycard=new CardLayout();
//        pCenter.setLayout(mycard);
//        textHelp=new TextArea();
//        pCenter.add("hanzi",showCharacters);
//        pCenter.add("help",textHelp);
//        add(pCenter,BorderLayout.CENTER);
//        menubar=new MenuBar();
//        menu=new Menu("帮助");
//        help=new MenuItem("关于学汉字");
//        help.addActionListener(this);
//        menu.add(help);
//        menubar.add(menu);
//        setMenuBar(menubar);
//        setSize(350,220);
//        setVisible(true);
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        validate();
//    }
//    public void itemStateChanged(ItemEvent e) {
//        String fileName=choice.getSelectedItem();
//        File file=new File(fileName);
//        trainedChinese=chinese.getChinesecharacters(file);
//        k=0;
//        mycard.show(pCenter,"hanzi") ;
//    }
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==getCharacters) {
//            if(trainedChinese!=null) {
//                char c=trainedChinese.charAt(k);
//                k++;
//                if(k>=trainedChinese.length())
//                    k=0;
//                showCharacters.setText(""+c);
//            } else {
//                showCharacters.setText("请选择一个汉字字符文件");
//            }
//        }
//        if(e.getSource()==voiceCharacters) {
//            if(!(voiceThread.isAlive())) {
//                voiceThread=new Thread(this);
//            }
//            try{ voiceThread.start();
//            }
//            catch(Exception exp){}
//        }
//        if(e.getSource()==help) {
//            mycard.show(pCenter,"help") ;
//            try{ File helpFile=new File("help.txt");
//                FileReader  inOne=【代码4】  //创建指向文件helpFile的inOne 的对象
//                BufferedReader inTwo=【代码5】 //创建指向文件inOne的inTwo 的对象
//                String s=null;
//                while((s=inTwo.readLine())!=null) {
//                    textHelp.append(s+"\n");
//                }
//                inOne.close();
//                inTwo.close();
//            }
//            catch(IOException exp){}
//        }
//    }
//    public void run() {
//        voiceCharacters.setEnabled(false);
//        try{ if(clip!=null) {
//            clip.close()
//        }
//            clip=AudioSystem.getClip();
//            File voiceFile=new File(showCharacters.getText().trim()+".wav");
//            clip.open(AudioSystem.getAudioInputStream(voiceFile));
//        }
//        catch(Exception exp){}
//        clip.start();
//        voiceCharacters.setEnabled(true);
//    }
//}
//class StudyMainClass {
//    public static void main(String args[]) {
//        new StudyFrame();
//    }
//}