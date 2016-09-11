we will store all the repository in here and implement a common repository throughout
note every class must implement a repository, and that repository must be in the pattern-component
#example: 
```
public interface BasicRepositoryService<Model extends AbstractDatabaseTable> {

    List<Model> getAll();

    List<Model> select(Predicate predicate);
    
    List<Model> selectBy(String fieldName);

}
```
implementation is as follows
