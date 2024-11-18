package com.seongeun.mission6;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/seongeun/mission6/ExampleRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/seongeun/mission6/ExampleRVAdapter$ExampleViewHolder;", "viewModel", "Lcom/seongeun/mission6/MainViewModel;", "(Lcom/seongeun/mission6/MainViewModel;)V", "exampleList", "", "Lcom/seongeun/mission6/ExampleItem;", "getExampleList", "()Ljava/util/List;", "setExampleList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ExampleViewHolder", "app_debug"})
public final class ExampleRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.seongeun.mission6.ExampleRVAdapter.ExampleViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.seongeun.mission6.MainViewModel viewModel = null;
    public java.util.List<com.seongeun.mission6.ExampleItem> exampleList;
    
    public ExampleRVAdapter(@org.jetbrains.annotations.NotNull
    com.seongeun.mission6.MainViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.seongeun.mission6.ExampleItem> getExampleList() {
        return null;
    }
    
    public final void setExampleList(@org.jetbrains.annotations.NotNull
    java.util.List<com.seongeun.mission6.ExampleItem> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.seongeun.mission6.ExampleRVAdapter.ExampleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.seongeun.mission6.ExampleRVAdapter.ExampleViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/seongeun/mission6/ExampleRVAdapter$ExampleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/seongeun/mission6/databinding/ItemExampleBinding;", "(Lcom/seongeun/mission6/databinding/ItemExampleBinding;)V", "getBinding", "()Lcom/seongeun/mission6/databinding/ItemExampleBinding;", "bind", "", "viewModel", "Lcom/seongeun/mission6/MainViewModel;", "item", "Lcom/seongeun/mission6/ExampleItem;", "Companion", "app_debug"})
    public static final class ExampleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.seongeun.mission6.databinding.ItemExampleBinding binding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.seongeun.mission6.ExampleRVAdapter.ExampleViewHolder.Companion Companion = null;
        
        private ExampleViewHolder(com.seongeun.mission6.databinding.ItemExampleBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.seongeun.mission6.databinding.ItemExampleBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.seongeun.mission6.MainViewModel viewModel, @org.jetbrains.annotations.NotNull
        com.seongeun.mission6.ExampleItem item) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/seongeun/mission6/ExampleRVAdapter$ExampleViewHolder$Companion;", "", "()V", "from", "Lcom/seongeun/mission6/ExampleRVAdapter$ExampleViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.seongeun.mission6.ExampleRVAdapter.ExampleViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}