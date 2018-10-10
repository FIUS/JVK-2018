/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.ArrayList;
import java.util.Arrays;

import de.unistuttgart.informatik.fius.icge.animations.Animation.AnimationType;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Entity;
import de.unistuttgart.informatik.fius.icge.simulation.GreedyEntity;
import de.unistuttgart.informatik.fius.icge.simulation.Simulation;
import de.unistuttgart.informatik.fius.icge.simulation.inspection.InspectionAttribute;
import de.unistuttgart.informatik.fius.icge.simulation.inspection.InspectionMethod;
import de.unistuttgart.informatik.fius.icge.territory.EntityState;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;
import de.unistuttgart.informatik.fius.icge.workbench.swing.AnimationInterpreter;

/**
 * A luigi entity
 * 
 * @author haslersn, neumantm
 */
public class Luigi extends GreedyEntity {
    
    /**
     * The entity state of luigi
     */
    public static class LuigiState extends GreedyEntityState {
        /**
         * Creates a new luigi entity state with the given inventory
         * 
         * @param inventory
         *            The inventory for this state.
         */
        public LuigiState(ArrayList<Entity> inventory) {
            super(inventory);
        }
        
        @Override
        public Entity createEntity(Simulation sim) {
            // This line only works as long as luigi can only collect coins
            return new Luigi(sim, this.inventory.size());
        }
    }
    
    /**
     * Creates a new luigi with in given simulation
     * 
     * @param sim
     *            The simulation for the new luigi.
     */
    public Luigi(Simulation sim) {
        super(sim, new ArrayList<>());
    }
    
    /**
     * Creates a new luigi with the given initial coin count in the given simulation.
     * 
     * @param sim
     *            The simulation for the new luigi.
     * @param coinCount
     *            The initial count of coins of luigi.
     */
    public Luigi(Simulation sim, int coinCount) {
        this(sim);
        setCoinCount(coinCount);
    }
    
    @Override
    public EntityState state() {
        return new LuigiState(this._inventory);
    }
    
    @Override
    protected boolean canCollectType(Class<? extends Entity> cls) {
        return cls == Coin.class;
    }
    
    @Override
    protected boolean canDropType(Class<? extends Entity> cls) {
        return cls == Coin.class;
    }
    
    /**
     * Get the coin count of luigi.
     * 
     * @return The coin count
     */
    @InspectionAttribute
    public int getCoinCount() {
        return this._inventory.size();
    }
    
    /**
     * Set the coin count of luigi.
     * 
     * @param count
     *            The coin count
     */
    @InspectionAttribute
    protected void setCoinCount(int count) {
        int diff = count - getCoinCount();
        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                this._inventory.add(new Coin(simulation()));
            }
        } else {
            for (int i = 0; i < -diff; i++) {
                int lastIndex = this._inventory.size() - 1;
                this._inventory.remove(lastIndex);
            }
        }
    }
    
    /**
     * Checks whether luigi can currently collect a coin
     * 
     * @return Whether luigi can collect a coin.
     */
    @InspectionMethod
    public boolean canCollectCoin() {
        return this.canCollect(Coin.class);
    }
    
    /**
     * Collect a coin.
     */
    public void collectCoin() {
        this.collect(Coin.class);
    }
    
    /**
     * Try to collect a coin.
     * 
     * @return Whether it worked.
     */
    @InspectionMethod
    public boolean tryCollectCoin() {
        return this.tryCollect(Coin.class);
    }
    
    /**
     * Check whether luigi can currently drop a coin
     * 
     * @return Whether luigi can collect a coin.
     */
    @InspectionMethod
    public boolean canDropCoin() {
        return this.canDrop(Coin.class);
    }
    
    /**
     * Drop a coin.
     */
    public void dropCoin() {
        this.drop(Coin.class);
    }
    
    /**
     * Try to drop a coin.
     * 
     * @return Whether it worked.
     */
    @InspectionMethod
    public boolean tryDropCoin() {
        return this.tryDrop(Coin.class);
    }
    
    static {
        AnimationInterpreter.accessAnimations(AnimationType.MOVE).set(LuigiState.class, Direction.EAST,
                Arrays.asList("luigi/luigi-east-0.png", "luigi/luigi-east-1.png"));
        AnimationInterpreter.accessAnimations(AnimationType.MOVE).set(LuigiState.class, Direction.NORTH,
                Arrays.asList("luigi/luigi-north-0.png", "luigi/luigi-north-1.png"));
        AnimationInterpreter.accessAnimations(AnimationType.MOVE).set(LuigiState.class, Direction.WEST,
                Arrays.asList("luigi/luigi-west-0.png", "luigi/luigi-west-1.png"));
        AnimationInterpreter.accessAnimations(AnimationType.MOVE).set(LuigiState.class, Direction.SOUTH,
                Arrays.asList("luigi/luigi-south-0.png", "luigi/luigi-south-1.png"));
        
        AnimationInterpreter.accessAnimations(AnimationType.TURN_LEFT).set(LuigiState.class, Direction.EAST,
                Arrays.asList("luigi/luigi-south-0.png", "luigi/luigi-east-1.png"));
        AnimationInterpreter.accessAnimations(AnimationType.TURN_LEFT).set(LuigiState.class, Direction.NORTH,
                Arrays.asList("luigi/luigi-east-0.png", "luigi/luigi-north-1.png"));
        AnimationInterpreter.accessAnimations(AnimationType.TURN_LEFT).set(LuigiState.class, Direction.WEST,
                Arrays.asList("luigi/luigi-north-0.png", "luigi/luigi-west-1.png"));
        AnimationInterpreter.accessAnimations(AnimationType.TURN_LEFT).set(LuigiState.class, Direction.SOUTH,
                Arrays.asList("luigi/luigi-west-0.png", "luigi/luigi-south-1.png"));
        
        AnimationInterpreter.accessNoneAnimations().set(LuigiState.class, Direction.EAST, "luigi/luigi-east-0.png");
        AnimationInterpreter.accessNoneAnimations().set(LuigiState.class, Direction.NORTH, "luigi/luigi-north-0.png");
        AnimationInterpreter.accessNoneAnimations().set(LuigiState.class, Direction.WEST, "luigi/luigi-west-0.png");
        AnimationInterpreter.accessNoneAnimations().set(LuigiState.class, Direction.SOUTH, "luigi/luigi-south-0.png");
    }
    
}
