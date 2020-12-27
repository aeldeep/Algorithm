package com.eldeep;

public class FreeSpace {


	public static void main(String[] args) {
		String S="my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
		//System.out.println(S);
		
		System.out.println(solution(S));
	}
	public static  String solution(String S) {
        // 7awelna el String l masfofa
		String[] lines = S.split("\r\n|\r|\n");
			int lNum= lines.length;
			int music=0;
			int img=0;
			int movies=0;
			int other=0;
			// lazem teb2y A2al men 500 3onsor
			if (lNum<500) {
				// bnsanafhom w negma3 emtedadathom ;)
		for (int i = 0 ; i<lNum;i++)
		{
			// to Separate size away from Extension
			lines[i].split(" ");
			String size = lines[i].substring(lines[i].indexOf(" ")+1, lines[i].length()-1);
			// to convert the String to Number using .ParseInt()
			int number = Integer.parseInt(size); 
			// CHeck extensions and add every one to belong extension
			if (lines[i].contains(".mp3") ||lines[i].contains(".acc") ||lines[i].contains(".flac"))
			{
				music+=number;
			}else if (lines[i].contains(".jpg") ||lines[i].contains(".bmp") ||lines[i].contains(".gif"))
			{
				img+=number;
			}else if(lines[i].contains(".mp4") ||lines[i].contains(".avi") ||lines[i].contains(".mkv")){
				movies+=number;
			}else {
				other+=number;
			}
			
		}
			}

		String result="music "+music+"b\n"+"images "+img+"b\n"+"movies "+movies+"b\n"+"other "+other+"b";
		//System.out.println(result);
		return result;
		
    }
}
