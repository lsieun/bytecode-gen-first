package lsieun.bytecode.gen.attrs;

public class AttributeInfo {
    public final byte tag;
    public final int attribute_name_index;
    public int attribute_length;

    public AttributeInfo(final byte tag, int attribute_name_index, int attribute_length) {
        this.tag = tag;
        this.attribute_name_index = attribute_name_index;
        this.attribute_length = attribute_length;
    }
}
