package org.lotr.entities.goods;

/**
 *
 */
public class GoodsCost {

    int[] cost = new int[GoodsType.values().length];

    /**
     * Create cost object with 0 values
     */
    public GoodsCost() {
    }

    /**
     * Create cost object with inital values
     *
     * @param mithril amount of mithril to add
     * @param wood    amount of wood to add
     * @param fish    amount of fish to add
     */
    public GoodsCost(int mithril, int wood, int fish) {
        this.cost[GoodsType.MITHRIL.ordinal()] = mithril;
        this.cost[GoodsType.WOOD.ordinal()] = wood;
        this.cost[GoodsType.FISH.ordinal()] = fish;
    }

    /**
     * Add cost object
     *
     * @param goodsCost cost object to add
     */
    public void add(GoodsCost goodsCost) {
        for (GoodsType gt : GoodsType.values()) {
            this.cost[gt.ordinal()] += goodsCost.getValue(gt);
        }
    }

    /**
     * Adding individual values to the cost object
     *
     * @param mithril amount of mithril to add
     * @param wood    amount of wood to add
     * @param fish    amount of fish to add
     */
    public void add(int mithril, int wood, int fish) {
        this.cost[GoodsType.MITHRIL.ordinal()] += mithril;
        this.cost[GoodsType.WOOD.ordinal()] += wood;
        this.cost[GoodsType.FISH.ordinal()] += fish;
    }

    /**
     * Multiply cost
     *
     * @param times
     */
    public void mul(int times){
        for (GoodsType gt : GoodsType.values()) {
            this.cost[gt.ordinal()] *= times;
        }
    }

    /**
     * Multiply new cost and add to cost
     *
     * @param cost  new cost
     * @param times quantity of new cost
     */
    public void mulAndAdd(GoodsCost cost,  int times){
        for (GoodsType gt : GoodsType.values()) {
            this.cost[gt.ordinal()] += cost.getValue(gt) * times;
        }
    }

    /**
     * Get individual value of component
     *
     * @param goodsType component enum
     * @return          value of component
     */
    public int getValue(GoodsType goodsType) {
        return this.cost[goodsType.ordinal()];
    }

    /**
     * Set individual value of component
     *
     * @param goodsType component enum
     * @param value     value of component
     */
    public void setValue(GoodsType goodsType, int value) {
        this.cost[goodsType.ordinal()] = value;
    }

    /**
     * Get value of GoodsType.MITHRIL component
     *
     * @return value of GoodsType.MITHRIL component
     */
    public int getMithril() {
        return this.cost[GoodsType.MITHRIL.ordinal()];
    }

    /**
     * Set value of GoodsType.MITHRIL component
     *
     * @param value value of GoogsType.MITHRIL component
     */
    public void setMithril(int value) {
        this.cost[GoodsType.MITHRIL.ordinal()] = value;
    }

    /**
     * Get value of GoodsType.WOOD component
     *
     * @return value of GoodsType.WOOD component
     */
    public int getWood() {
        return this.cost[GoodsType.WOOD.ordinal()];
    }

    /**
     * Set value of GoodsType.WOOD component
     *
     * @param value value of GoogsType.WOOD component
     */
    public void setWood(int value) {
        this.cost[GoodsType.WOOD.ordinal()] = value;
    }

    /**
     * Get value of GoodsType.FISH component
     *
     * @return value of GoodsType.FISH component
     */
    public int getFish() {
        return this.cost[GoodsType.FISH.ordinal()];
    }

    /**
     * Set value of GoodsType.FISH component
     *
     * @param value value of GoogsType.FISH component
     */
    public void setFish(int value) {
        this.cost[GoodsType.FISH.ordinal()] = value;
    }

}
