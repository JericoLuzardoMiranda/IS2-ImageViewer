package software.ulpgc.ImageViewer;

public interface Image {
    String name();
    Image next();
    Image prev();
}
