@Override
public void onViewDetachedFromWindow(ViewHolder holder) {
    RecyclerView recyclerView = (RecyclerView) holder.itemView.getParent();
    recyclerView.getLayoutManager().setClipToPadding(false);
    recyclerView.getLayoutManager().setClipChildren(false);
}
