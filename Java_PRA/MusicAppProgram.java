/*
Write a Java code that implements the following

Create a class MusicApp with following

1.Attributes

appid: Integer
appName: String
appSubscription Integer
songs: List of Songs for the musicApp

2.Getters and Setters Methods
3.Parameterized constructor

Create a class Song with following

1.Attributes

songld Integer
song Name: Str String
singerNamer String
song Views integer

2.Getters and Setters Methods
3 Parameterized constructor

Relationship

Each musicApp can have multiple Songs objects.

Create a class Service with following methods

1.CalculateAverageViewsBySinger Name:

-This method will take a list of musicApp objects and a singer Name as input. This method calculates and Prints the Average
Views wrt singerName across the various musicApp. If no song is found the method should print a message
"No Song found with mentioned singer Name." (Without quotes)

You need to throw an custom based exception in case of, if the songViewer of a song is negative.
The method should throw an exception called ViewisNegativeException which includes a message
"Invalid SongsView: SongViews cannot be negative." (without quotes).

2.findmusicAppOfSengsBySong Name:

This method will take a list of Song objects and string parameter SongName.Method should print the list of all the musicApp
Names who have Songs where the songName is same as passed as a parameter. (refer The output)
If no match is found then method should print the message "No quotes) No matching musicApp found." (Without Quotes)

Create a class Tester

1 Take inputs

2. Create Object of Service class to call the methods.

Note-Every String Comparison should be case sensitive. The value for number of mus number of musicApps to be added can range
from 0 to 100. In case, number of musicApps to be added is 0, you have to print you have to print "No musicAppFound

Refer the sample input and output.

Sample Input:

3//Number of music Apps

1234 //ld for musicApp

Wynk //name of the musicApp

500 //subscription fees of musichop

3 //number of songs on Wynk musicApp

988 //ld of Song on Wynk musicApp

KingShit //Name of song on Wynk musicApp

Shubh //SingerName of songs on Wynk musicApp

70000 //Viewers of songs on Wynk musicApp

653 //ld of Song on Wynk musicApp

ApnaBanaLePiya //Name of song on Wynk musicApp

Arijit //SingerName of songs on Wynk musicApp

90000 //Viewers of songs on Wynk musicApp

345 //ld of Song on Wynk musicApp

AabadBarbaad //Name of song on Wynk musicApp

Arijit //SingerName of songs on Wynk musicApp

55000 //Viewers of songs on Wynk musicApp

1235 //ld for musicApp

Spotify //name of the musicApp

350 //subscription fees of musicApp

3 //number of songs on Spotify musicApp

988 //ld of song on Spotify musicApp

KingShit //Name of song on Spotify musicApp

Shubh //Singer Name of songs on Spotify musicApp

9000 //Viewers of song on Spotify musicApp

653 //ld of song on Spotify musicApp

Saware //Name of song on Spotify musicApp

Arijit //SingerName of songs on Spotify musicApp

100000 //Viewers of song on Spotify musicApp

345 //ld of song on Spotify musicApp

Tumhare Hi Rahenge Hum //Name of song on Spotify musicApp

Varun//SingerName of songs on Spotify musicApp

120000 //Viewers of song on Spotify musicApp

1236 //ld for musicApp

JiioSaavn //name of the musicApp

450 //subscription fees of musicApp

3 //number of songs on JiioSaavn musicApp

980 //ld of song on JiloSaavn musicApp

Numb //Name of song on JlioSaavn musicApp

LinkanPark //SingerName on JiioSaavn musicApp

9000 //Viewers of song on JiloSaavn musicApp

653 //ld of song on JiloSaavn musicApp

Saware//Name of song on Spotify musicApp

Arijit //SingerName of songs on Spotify musicApp

100000 //Viewers of song on Spotify musicApp

345 //ld of song on Spotify musicApp

Tumhare Hi Rahenge Hum //Name of song on Spotify musicApp

Varun //SingerName of songs on Spotify musicApp

120000 //Viewers of song on Spotify musicApp

1236 //ld for musicApp

JiloSaavn //narne of the musicApp

450 //subscription fees of musicApp

3 //number of songs on JiioSaavn musicApp

980 //ld of song on JlioSaavn musicApp

Numb //Name of song on JiloSaavn musicApp

LinkanPark //SingerName on JiloSaavn musicApp

9000 //Viewers of song on JiioSaavn musicApp

653 //ld of song on JiioSaavn musicApp

Jo TuNaMila //Narne of song on JiloSaavn musicApp

AsimAzhar //SingerName on JlioSaavn musicApp

100000 //Viewers of song on JiioSaavn musicApp

345 //ld of song on jlioSaavn musicApp

Humraah //Name of song on JiloSaavn musicApp

AsimAzhar //SingerName on JiioSaavn musicApp

120000 //Viewers of song on JiioSaavn musicApp

Arijit //Argument for CalculateAverage ViewsBySinger Name function

JoTuNaMila //Argument for findmusicAppOfSongsBySongName function

Sample output

81666

Jilo Saavn

Explanation:

The first line of output is the average Viewership of the songs of the given singer name

The following line(s) is/are the list of music App name/names who have songs with Songname Same as that of Input
 */


package Java_PRA;

import java.util.*;

public class MusicAppProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (n == 0) {
            System.out.println("No musicAppFound");
            return;
        }

        List<MusicApp> musicApps = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int appid = Integer.parseInt(sc.nextLine());
            String appName = sc.nextLine();
            int appSubscription = Integer.parseInt(sc.nextLine());
            int numSongs = Integer.parseInt(sc.nextLine());

            List<Song> songs = new ArrayList<>();
            for (int j = 0; j < numSongs; j++) {
                int songId = Integer.parseInt(sc.nextLine());
                String songName = sc.nextLine();
                String singerName = sc.nextLine();
                int songViews = Integer.parseInt(sc.nextLine());
                songs.add(new Song(songId, songName, singerName, songViews));
            }
            musicApps.add(new MusicApp(appid, appName, appSubscription, songs));
        }

        String singerName = sc.nextLine();
        String songName = sc.nextLine();

        ServiceTest service = new ServiceTest();
        service.calculateAverageViewsBySingerName(musicApps, singerName);
        service.findMusicAppOfSongsBySongName(musicApps, songName);
    }
}

class ServiceTest {
    public void calculateAverageViewsBySingerName(List<MusicApp> apps, String singerName) {
        int totalViews = 0, count = 0;
        try {
            for (MusicApp app : apps) {
                for (Song song : app.getSongs()) {
                    if (song.getSingerName().equals(singerName)) {
                        if (song.getSongViews() < 0) {
                            throw new ViewisNegativeException("Invalid SongsView: SongViews cannot be negative.");
                        }
                        else {
                            totalViews += song.getSongViews();
                            count++;
                        }
                    }
                }
            }
            if (count == 0) {
                System.out.println("No Song found with mentioned singer Name.");
            } else {
                System.out.println(totalViews / count);
            }
        } catch (ViewisNegativeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void findMusicAppOfSongsBySongName(List<MusicApp> apps, String songName) {
        List<String> result = new ArrayList<>();
        for (MusicApp app : apps) {
            for (Song song : app.getSongs()) {
                if (song.getSongName().equals(songName)) {
                    result.add(app.getAppName());
                    break;
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("No matching musicApp found.");
        } else {
            for (String name : result) {
                System.out.println(name);
            }
        }
    }
}

class MusicApp {
    private int appid;
    private String appName;
    private int appSubscription;
    private List<Song> songs;

    public MusicApp(int appid, String appName, int appSubscription, List<Song> songs) {
        this.appid = appid;
        this.appName = appName;
        this.appSubscription = appSubscription;
        this.songs = songs;
    }

    public int getAppid() {
        return appid;
    }

    public String getAppName() {
        return appName;
    }

    public int getAppSubscription() {
        return appSubscription;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAppSubscription(int appSubscription) {
        this.appSubscription = appSubscription;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}

class Song {
    private int songId;
    private String songName;
    private String singerName;
    private int songViews;

    public Song(int songId, String songName, String singerName, int songViews) {
        this.songId = songId;
        this.songName = songName;
        this.singerName = singerName;
        this.songViews = songViews;
    }

    public int getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public int getSongViews() {
        return songViews;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSongViews(int songViews) {
        this.songViews = songViews;
    }
}

class ViewisNegativeException extends Exception {
    public ViewisNegativeException(String message) {
        super(message);
    }
}




