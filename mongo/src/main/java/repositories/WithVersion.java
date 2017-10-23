package repositories;

/**
 * Created by zhaoao.zhang on 23/11/2016.
 */
public interface WithVersion<T> extends WithId<T> {

    String NAME = "version";

    long getVersion();
}
