package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new pub.gll.onepeas.module.sample.DataBinderMapperImpl());
  }
}
