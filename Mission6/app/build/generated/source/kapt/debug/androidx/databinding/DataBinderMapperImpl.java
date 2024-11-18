package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.seongeun.mission6.DataBinderMapperImpl());
  }
}
