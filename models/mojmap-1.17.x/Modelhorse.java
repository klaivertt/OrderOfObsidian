// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhorse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "horse"), "main");
	private final ModelPart Body;
	private final ModelPart TailA;
	private final ModelPart TailB;
	private final ModelPart TailC;
	private final ModelPart Leg1A;
	private final ModelPart Leg1B;
	private final ModelPart Leg1C;
	private final ModelPart Leg2A;
	private final ModelPart Leg2B;
	private final ModelPart Leg2C;
	private final ModelPart Leg3A;
	private final ModelPart Leg3B;
	private final ModelPart Leg3C;
	private final ModelPart Leg4A;
	private final ModelPart Leg4B;
	private final ModelPart Leg4C;
	private final ModelPart Head;
	private final ModelPart UMouth;
	private final ModelPart LMouth;
	private final ModelPart Ear1;
	private final ModelPart Ear2;
	private final ModelPart MuleEarL;
	private final ModelPart MuleEarR;
	private final ModelPart Neck;
	private final ModelPart Bag1;
	private final ModelPart Bag2;
	private final ModelPart Saddle;
	private final ModelPart SaddleB;
	private final ModelPart SaddleC;
	private final ModelPart SaddleL2;
	private final ModelPart SaddleL;
	private final ModelPart SaddleR2;
	private final ModelPart SaddleR;
	private final ModelPart SaddleMouthL;
	private final ModelPart SaddleMouthR;
	private final ModelPart SaddleMouthLine;
	private final ModelPart SaddleMouthLineR;
	private final ModelPart Mane;
	private final ModelPart HeadSaddle;

	public Modelhorse(ModelPart root) {
		this.Body = root.getChild("Body");
		this.TailA = root.getChild("TailA");
		this.TailB = root.getChild("TailB");
		this.TailC = root.getChild("TailC");
		this.Leg1A = root.getChild("Leg1A");
		this.Leg1B = root.getChild("Leg1B");
		this.Leg1C = root.getChild("Leg1C");
		this.Leg2A = root.getChild("Leg2A");
		this.Leg2B = root.getChild("Leg2B");
		this.Leg2C = root.getChild("Leg2C");
		this.Leg3A = root.getChild("Leg3A");
		this.Leg3B = root.getChild("Leg3B");
		this.Leg3C = root.getChild("Leg3C");
		this.Leg4A = root.getChild("Leg4A");
		this.Leg4B = root.getChild("Leg4B");
		this.Leg4C = root.getChild("Leg4C");
		this.Head = root.getChild("Head");
		this.UMouth = root.getChild("UMouth");
		this.LMouth = root.getChild("LMouth");
		this.Ear1 = root.getChild("Ear1");
		this.Ear2 = root.getChild("Ear2");
		this.MuleEarL = root.getChild("MuleEarL");
		this.MuleEarR = root.getChild("MuleEarR");
		this.Neck = root.getChild("Neck");
		this.Bag1 = root.getChild("Bag1");
		this.Bag2 = root.getChild("Bag2");
		this.Saddle = root.getChild("Saddle");
		this.SaddleB = root.getChild("SaddleB");
		this.SaddleC = root.getChild("SaddleC");
		this.SaddleL2 = root.getChild("SaddleL2");
		this.SaddleL = root.getChild("SaddleL");
		this.SaddleR2 = root.getChild("SaddleR2");
		this.SaddleR = root.getChild("SaddleR");
		this.SaddleMouthL = root.getChild("SaddleMouthL");
		this.SaddleMouthR = root.getChild("SaddleMouthR");
		this.SaddleMouthLine = root.getChild("SaddleMouthLine");
		this.SaddleMouthLineR = root.getChild("SaddleMouthLineR");
		this.Mane = root.getChild("Mane");
		this.HeadSaddle = root.getChild("HeadSaddle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 34).mirror()
						.addBox(-5.0F, -8.0F, -19.0F, 10.0F, 10.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 11.0F, 9.0F));

		PartDefinition TailA = partdefinition.addOrReplaceChild("TailA",
				CubeListBuilder.create().texOffs(44, 0).mirror()
						.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition TailB = partdefinition.addOrReplaceChild("TailB",
				CubeListBuilder.create().texOffs(38, 7).mirror()
						.addBox(-1.5F, -2.0F, 3.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition TailC = partdefinition.addOrReplaceChild("TailC",
				CubeListBuilder.create().texOffs(24, 3).mirror()
						.addBox(-1.5F, -4.5F, 9.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, -1.4022F, 0.0F, 0.0F));

		PartDefinition Leg1A = partdefinition.addOrReplaceChild("Leg1A",
				CubeListBuilder.create().texOffs(78, 29).mirror()
						.addBox(-1.5F, -2.0F, -2.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-4.0F, 9.0F, 11.0F));

		PartDefinition Leg1B = partdefinition.addOrReplaceChild("Leg1B",
				CubeListBuilder.create().texOffs(78, 43).mirror()
						.addBox(-1.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-4.0F, 16.0F, 11.0F));

		PartDefinition Leg1C = partdefinition.addOrReplaceChild("Leg1C",
				CubeListBuilder.create().texOffs(78, 51).mirror()
						.addBox(-1.5F, 5.1F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-4.0F, 16.0F, 11.0F));

		PartDefinition Leg2A = partdefinition.addOrReplaceChild("Leg2A",
				CubeListBuilder.create().texOffs(96, 29).mirror()
						.addBox(-2.5F, -2.0F, -2.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 9.0F, 11.0F));

		PartDefinition Leg2B = partdefinition.addOrReplaceChild("Leg2B",
				CubeListBuilder.create().texOffs(96, 43).mirror()
						.addBox(-2.0F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 16.0F, 11.0F));

		PartDefinition Leg2C = partdefinition.addOrReplaceChild("Leg2C",
				CubeListBuilder.create().texOffs(96, 51).mirror()
						.addBox(-2.5F, 5.1F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 16.0F, 11.0F));

		PartDefinition Leg3A = partdefinition.addOrReplaceChild("Leg3A",
				CubeListBuilder.create().texOffs(44, 29).mirror()
						.addBox(-1.1F, -1.0F, -2.1F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-4.0F, 9.0F, -8.0F));

		PartDefinition Leg3B = partdefinition.addOrReplaceChild("Leg3B",
				CubeListBuilder.create().texOffs(44, 41).mirror()
						.addBox(-1.1F, 0.0F, -1.6F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-4.0F, 16.0F, -8.0F));

		PartDefinition Leg3C = partdefinition.addOrReplaceChild("Leg3C",
				CubeListBuilder.create().texOffs(44, 51).mirror()
						.addBox(-1.6F, 5.1F, -2.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-4.0F, 16.0F, -8.0F));

		PartDefinition Leg4A = partdefinition.addOrReplaceChild("Leg4A",
				CubeListBuilder.create().texOffs(60, 29).mirror()
						.addBox(-1.9F, -1.0F, -2.1F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 9.0F, -8.0F));

		PartDefinition Leg4B = partdefinition.addOrReplaceChild("Leg4B",
				CubeListBuilder.create().texOffs(60, 41).mirror()
						.addBox(-1.9F, 0.0F, -1.6F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 16.0F, -8.0F));

		PartDefinition Leg4C = partdefinition.addOrReplaceChild("Leg4C",
				CubeListBuilder.create().texOffs(60, 51).mirror()
						.addBox(-2.4F, 5.1F, -2.1F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 16.0F, -8.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.5F, -10.0F, -1.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition UMouth = partdefinition.addOrReplaceChild("UMouth",
				CubeListBuilder.create().texOffs(24, 18).mirror()
						.addBox(-2.0F, -10.0F, -7.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.95F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition LMouth = partdefinition.addOrReplaceChild("LMouth",
				CubeListBuilder.create().texOffs(24, 27).mirror()
						.addBox(-2.0F, -7.0F, -6.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Ear1 = partdefinition.addOrReplaceChild("Ear1",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.45F, -12.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Ear2 = partdefinition.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.45F, -12.0F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition MuleEarL = partdefinition.addOrReplaceChild("MuleEarL",
				CubeListBuilder.create().texOffs(0, 12).mirror()
						.addBox(0.0F, -16.0F, 4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.2618F));

		PartDefinition MuleEarR = partdefinition.addOrReplaceChild("MuleEarR",
				CubeListBuilder.create().texOffs(0, 12).mirror()
						.addBox(-2.0F, -16.0F, 4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, -0.2618F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 12).mirror()
						.addBox(-1.95F, -9.8F, -2.0F, 4.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Bag1 = partdefinition.addOrReplaceChild("Bag1",
				CubeListBuilder.create().texOffs(0, 34).mirror()
						.addBox(-3.0F, 0.0F, -3.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5F, 3.0F, 10.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Bag2 = partdefinition.addOrReplaceChild("Bag2",
				CubeListBuilder.create().texOffs(0, 47).mirror()
						.addBox(-5.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5F, 3.0F, 10.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Saddle = partdefinition.addOrReplaceChild("Saddle",
				CubeListBuilder.create().texOffs(80, 0).mirror()
						.addBox(-5.0F, 0.0F, -3.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 2.0F, 2.0F));

		PartDefinition SaddleB = partdefinition.addOrReplaceChild("SaddleB",
				CubeListBuilder.create().texOffs(106, 9).mirror()
						.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 2.0F, 2.0F));

		PartDefinition SaddleC = partdefinition.addOrReplaceChild("SaddleC",
				CubeListBuilder.create().texOffs(80, 9).mirror()
						.addBox(-4.0F, -1.0F, 3.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 2.0F, 2.0F));

		PartDefinition SaddleL2 = partdefinition.addOrReplaceChild("SaddleL2",
				CubeListBuilder.create().texOffs(74, 0).mirror()
						.addBox(-0.5F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 3.0F, 2.0F));

		PartDefinition SaddleL = partdefinition.addOrReplaceChild("SaddleL",
				CubeListBuilder.create().texOffs(70, 0).mirror()
						.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 3.0F, 2.0F));

		PartDefinition SaddleR2 = partdefinition.addOrReplaceChild("SaddleR2",
				CubeListBuilder.create().texOffs(74, 4).mirror()
						.addBox(-0.5F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 3.0F, 2.0F));

		PartDefinition SaddleR = partdefinition.addOrReplaceChild("SaddleR",
				CubeListBuilder.create().texOffs(80, 0).mirror()
						.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 3.0F, 2.0F));

		PartDefinition SaddleMouthL = partdefinition.addOrReplaceChild("SaddleMouthL",
				CubeListBuilder.create().texOffs(74, 13).mirror()
						.addBox(-2.5F, -8.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition SaddleMouthR = partdefinition.addOrReplaceChild("SaddleMouthR",
				CubeListBuilder.create().texOffs(74, 13).mirror()
						.addBox(1.5F, -8.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition SaddleMouthLine = partdefinition.addOrReplaceChild("SaddleMouthLine",
				CubeListBuilder.create().texOffs(44, 10).mirror()
						.addBox(-2.6F, -6.0F, -6.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 4.0F, -10.0F));

		PartDefinition SaddleMouthLineR = partdefinition.addOrReplaceChild("SaddleMouthLineR",
				CubeListBuilder.create().texOffs(44, 5).mirror()
						.addBox(2.6F, -6.0F, -6.0F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 4.0F, -10.0F));

		PartDefinition Mane = partdefinition.addOrReplaceChild("Mane",
				CubeListBuilder.create().texOffs(58, 0).mirror()
						.addBox(-1.0F, -11.5F, 5.0F, 2.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition HeadSaddle = partdefinition.addOrReplaceChild("HeadSaddle",
				CubeListBuilder.create().texOffs(80, 12).mirror()
						.addBox(-2.5F, -10.1F, -7.0F, 5.0F, 5.0F, 12.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, -10.0F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		TailA.render(poseStack, buffer, packedLight, packedOverlay);
		TailB.render(poseStack, buffer, packedLight, packedOverlay);
		TailC.render(poseStack, buffer, packedLight, packedOverlay);
		Leg1A.render(poseStack, buffer, packedLight, packedOverlay);
		Leg1B.render(poseStack, buffer, packedLight, packedOverlay);
		Leg1C.render(poseStack, buffer, packedLight, packedOverlay);
		Leg2A.render(poseStack, buffer, packedLight, packedOverlay);
		Leg2B.render(poseStack, buffer, packedLight, packedOverlay);
		Leg2C.render(poseStack, buffer, packedLight, packedOverlay);
		Leg3A.render(poseStack, buffer, packedLight, packedOverlay);
		Leg3B.render(poseStack, buffer, packedLight, packedOverlay);
		Leg3C.render(poseStack, buffer, packedLight, packedOverlay);
		Leg4A.render(poseStack, buffer, packedLight, packedOverlay);
		Leg4B.render(poseStack, buffer, packedLight, packedOverlay);
		Leg4C.render(poseStack, buffer, packedLight, packedOverlay);
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		UMouth.render(poseStack, buffer, packedLight, packedOverlay);
		LMouth.render(poseStack, buffer, packedLight, packedOverlay);
		Ear1.render(poseStack, buffer, packedLight, packedOverlay);
		Ear2.render(poseStack, buffer, packedLight, packedOverlay);
		MuleEarL.render(poseStack, buffer, packedLight, packedOverlay);
		MuleEarR.render(poseStack, buffer, packedLight, packedOverlay);
		Neck.render(poseStack, buffer, packedLight, packedOverlay);
		Bag1.render(poseStack, buffer, packedLight, packedOverlay);
		Bag2.render(poseStack, buffer, packedLight, packedOverlay);
		Saddle.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleB.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleC.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleL2.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleL.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleR2.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleR.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleMouthL.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleMouthR.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleMouthLine.render(poseStack, buffer, packedLight, packedOverlay);
		SaddleMouthLineR.render(poseStack, buffer, packedLight, packedOverlay);
		Mane.render(poseStack, buffer, packedLight, packedOverlay);
		HeadSaddle.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.HeadSaddle.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.HeadSaddle.xRot = headPitch / (180F / (float) Math.PI);
	}
}