package gamari.design.builder;

public class SampleBuilder {

    private String message;

    public static SampleBuilder sample() {
        return new SampleBuilder();
    }

    public void buildAndThrow() throws SampleException {
        throw new SampleException();
    }

}

class SampleException extends Exception {
    // TODO
}