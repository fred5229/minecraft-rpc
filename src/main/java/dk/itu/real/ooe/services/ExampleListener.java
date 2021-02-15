package dk.itu.real.ooe.services;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.EventListener;
import org.spongepowered.api.event.world.SaveWorldEvent;import java.util.UUID;
import com.google.protobuf.Empty;
import dk.itu.real.ooe.Minecraft;
import dk.itu.real.ooe.Minecraft.*;
import dk.itu.real.ooe.MinecraftServiceGrpc.MinecraftServiceImplBase;
import io.grpc.stub.StreamObserver;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.cause.EventContextKeys;
import org.spongepowered.api.event.CauseStackManager.StackFrame;
import org.spongepowered.api.event.cause.entity.spawn.SpawnTypes;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.mutable.block.DirectionalData;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.scheduler.Task;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;
import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.entity.living.player.Player;


public class ExampleListener {
    @Listener
    public void onSaveEvent(SaveWorldEvent event) {
        World world = Sponge.getServer().getWorlds().iterator().next();
        Player p = world.getPlayers().iterator().next();
        p.kick();
    }
}