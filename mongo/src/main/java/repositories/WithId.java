package repositories;

/**
 * Created by zhaoao.zhang on 22/11/2016.
 */
public interface WithId<T> {

    String NAME = "id";
    T getId();
}
