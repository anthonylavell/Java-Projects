
package design_pattern.creational.facade.main;

import design_pattern.creational.facade.VideoConverterFacade;

public class Client {
    public static void main(String[] args) {
        VideoConverterFacade converter = new VideoConverterFacade();
        // Client interacts with a single, simple method
        converter.convertAndSave("my_vacation_video.mp4");
    }
}
