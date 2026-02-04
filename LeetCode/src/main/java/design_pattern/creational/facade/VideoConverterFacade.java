/*
A facade is just a coordinator class that hides complexity.
It acts as a single, unified entry point, hiding the underlying complexity
and making the system easier to use and maintain.
 */

package design_pattern.creational.facade;

class AudioMixer{
    public String fix(String file) { return "Fixed Audio: " + file; }
}

class VideoCompressor {
    public String compress(String file) { return "Compressed Video: " + file; }
}

class FileSaver {
    public void save(String file) { System.out.println("Saving file: " + file); }
}

// The Facade class
public class VideoConverterFacade {
    private final AudioMixer audioMixer;
    private final VideoCompressor videoCompressor;
    private final FileSaver fileSaver;

    public VideoConverterFacade() {
        this.audioMixer = new AudioMixer();
        this.videoCompressor = new VideoCompressor();
        this.fileSaver = new FileSaver();
    }

    // A simple method for the client to use
    public void convertAndSave(String fileName) {
        System.out.println("Starting conversion for: " + fileName);
        String fixedAudio = audioMixer.fix(fileName);
        String compressedVideo = videoCompressor.compress(fixedAudio);
        fileSaver.save(compressedVideo);
        System.out.println("Conversion complete.");
    }
}
