import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import lobicons.Lobicons
import lobicons.*
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

val allIcons: List<Pair<String, DrawableResource>> = listOf(
    "Ace" to Lobicons.Ace,
    "Adobe" to Lobicons.Adobe,
    "AdobeColor" to Lobicons.AdobeColor,
    "Adobefirefly" to Lobicons.Adobefirefly,
    "AdobefireflyColor" to Lobicons.AdobefireflyColor,
    "Agentvoice" to Lobicons.Agentvoice,
    "AgentvoiceColor" to Lobicons.AgentvoiceColor,
    "Agui" to Lobicons.Agui,
    "Ai2" to Lobicons.Ai2,
    "Ai21" to Lobicons.Ai21,
    "Ai2Color" to Lobicons.Ai2Color,
    "Ai302" to Lobicons.Ai302,
    "Ai302Color" to Lobicons.Ai302Color,
    "Ai360" to Lobicons.Ai360,
    "Ai360Color" to Lobicons.Ai360Color,
    "Aihubmix" to Lobicons.Aihubmix,
    "AihubmixColor" to Lobicons.AihubmixColor,
    "Aimass" to Lobicons.Aimass,
    "AimassColor" to Lobicons.AimassColor,
    "Aionlabs" to Lobicons.Aionlabs,
    "AionlabsColor" to Lobicons.AionlabsColor,
    "Aistudio" to Lobicons.Aistudio,
    "Akashchat" to Lobicons.Akashchat,
    "AkashchatColor" to Lobicons.AkashchatColor,
    "Alephalpha" to Lobicons.Alephalpha,
    "Alibaba" to Lobicons.Alibaba,
    "Alibabacloud" to Lobicons.Alibabacloud,
    "AlibabacloudColor" to Lobicons.AlibabacloudColor,
    "AlibabaColor" to Lobicons.AlibabaColor,
    "Amp" to Lobicons.Amp,
    "AmpColor" to Lobicons.AmpColor,
    "Antgroup" to Lobicons.Antgroup,
    "AntgroupColor" to Lobicons.AntgroupColor,
    "Anthropic" to Lobicons.Anthropic,
    "Antigravity" to Lobicons.Antigravity,
    "AntigravityColor" to Lobicons.AntigravityColor,
    "Anyscale" to Lobicons.Anyscale,
    "AnyscaleColor" to Lobicons.AnyscaleColor,
    "Apertis" to Lobicons.Apertis,
    "ApertisColor" to Lobicons.ApertisColor,
    "Apple" to Lobicons.Apple,
    "Arcee" to Lobicons.Arcee,
    "ArceeColor" to Lobicons.ArceeColor,
    "Askverdict" to Lobicons.Askverdict,
    "AskverdictColor" to Lobicons.AskverdictColor,
    "Assemblyai" to Lobicons.Assemblyai,
    "AssemblyaiColor" to Lobicons.AssemblyaiColor,
    "Atlascloud" to Lobicons.Atlascloud,
    "Automatic" to Lobicons.Automatic,
    "AutomaticColor" to Lobicons.AutomaticColor,
    "Aws" to Lobicons.Aws,
    "AwsColor" to Lobicons.AwsColor,
    "Aya" to Lobicons.Aya,
    "AyaColor" to Lobicons.AyaColor,
    "Azure" to Lobicons.Azure,
    "Azureai" to Lobicons.Azureai,
    "AzureaiColor" to Lobicons.AzureaiColor,
    "AzureColor" to Lobicons.AzureColor,
    "Baai" to Lobicons.Baai,
    "Baichuan" to Lobicons.Baichuan,
    "BaichuanColor" to Lobicons.BaichuanColor,
    "Baidu" to Lobicons.Baidu,
    "Baiducloud" to Lobicons.Baiducloud,
    "BaiducloudColor" to Lobicons.BaiducloudColor,
    "BaiduColor" to Lobicons.BaiduColor,
    "Bailian" to Lobicons.Bailian,
    "BailianColor" to Lobicons.BailianColor,
    "Baseten" to Lobicons.Baseten,
    "Bedrock" to Lobicons.Bedrock,
    "BedrockColor" to Lobicons.BedrockColor,
    "Bfl" to Lobicons.Bfl,
    "Bilibili" to Lobicons.Bilibili,
    "BilibiliColor" to Lobicons.BilibiliColor,
    "Bilibiliindex" to Lobicons.Bilibiliindex,
    "Bing" to Lobicons.Bing,
    "BingColor" to Lobicons.BingColor,
    "Briaai" to Lobicons.Briaai,
    "BriaaiColor" to Lobicons.BriaaiColor,
    "Burncloud" to Lobicons.Burncloud,
    "BurncloudColor" to Lobicons.BurncloudColor,
    "Bytedance" to Lobicons.Bytedance,
    "BytedanceColor" to Lobicons.BytedanceColor,
    "Capcut" to Lobicons.Capcut,
    "Centml" to Lobicons.Centml,
    "CentmlColor" to Lobicons.CentmlColor,
    "Cerebras" to Lobicons.Cerebras,
    "CerebrasColor" to Lobicons.CerebrasColor,
    "Chatglm" to Lobicons.Chatglm,
    "ChatglmColor" to Lobicons.ChatglmColor,
    "Cherrystudio" to Lobicons.Cherrystudio,
    "CherrystudioColor" to Lobicons.CherrystudioColor,
    "Civitai" to Lobicons.Civitai,
    "CivitaiColor" to Lobicons.CivitaiColor,
    "Claude" to Lobicons.Claude,
    "Claudecode" to Lobicons.Claudecode,
    "ClaudecodeColor" to Lobicons.ClaudecodeColor,
    "ClaudeColor" to Lobicons.ClaudeColor,
    "Cline" to Lobicons.Cline,
    "Clipdrop" to Lobicons.Clipdrop,
    "Cloudflare" to Lobicons.Cloudflare,
    "CloudflareColor" to Lobicons.CloudflareColor,
    "Codeflicker" to Lobicons.Codeflicker,
    "CodeflickerColor" to Lobicons.CodeflickerColor,
    "Codegeex" to Lobicons.Codegeex,
    "CodegeexColor" to Lobicons.CodegeexColor,
    "Codex" to Lobicons.Codex,
    "CodexColor" to Lobicons.CodexColor,
    "Cogvideo" to Lobicons.Cogvideo,
    "CogvideoColor" to Lobicons.CogvideoColor,
    "Cogview" to Lobicons.Cogview,
    "CogviewColor" to Lobicons.CogviewColor,
    "Cohere" to Lobicons.Cohere,
    "CohereColor" to Lobicons.CohereColor,
    "Colab" to Lobicons.Colab,
    "ColabColor" to Lobicons.ColabColor,
    "Cometapi" to Lobicons.Cometapi,
    "CometapiColor" to Lobicons.CometapiColor,
    "Comfyui" to Lobicons.Comfyui,
    "ComfyuiColor" to Lobicons.ComfyuiColor,
    "Commanda" to Lobicons.Commanda,
    "CommandaColor" to Lobicons.CommandaColor,
    "Copilot" to Lobicons.Copilot,
    "CopilotColor" to Lobicons.CopilotColor,
    "Copilotkit" to Lobicons.Copilotkit,
    "CopilotkitColor" to Lobicons.CopilotkitColor,
    "Coqui" to Lobicons.Coqui,
    "CoquiColor" to Lobicons.CoquiColor,
    "Coze" to Lobicons.Coze,
    "Crewai" to Lobicons.Crewai,
    "CrewaiColor" to Lobicons.CrewaiColor,
    "Crusoe" to Lobicons.Crusoe,
    "CrusoeColor" to Lobicons.CrusoeColor,
    "Cursor" to Lobicons.Cursor,
    "Cybercut" to Lobicons.Cybercut,
    "Dalle" to Lobicons.Dalle,
    "DalleColor" to Lobicons.DalleColor,
    "Dbrx" to Lobicons.Dbrx,
    "DbrxColor" to Lobicons.DbrxColor,
    "Deepai" to Lobicons.Deepai,
    "Deepcogito" to Lobicons.Deepcogito,
    "DeepcogitoColor" to Lobicons.DeepcogitoColor,
    "Deepinfra" to Lobicons.Deepinfra,
    "DeepinfraColor" to Lobicons.DeepinfraColor,
    "Deepl" to Lobicons.Deepl,
    "DeeplColor" to Lobicons.DeeplColor,
    "Deepmind" to Lobicons.Deepmind,
    "DeepmindColor" to Lobicons.DeepmindColor,
    "Deepseek" to Lobicons.Deepseek,
    "DeepseekColor" to Lobicons.DeepseekColor,
    "Dify" to Lobicons.Dify,
    "DifyColor" to Lobicons.DifyColor,
    "Doc2x" to Lobicons.Doc2x,
    "Doc2xColor" to Lobicons.Doc2xColor,
    "Docsearch" to Lobicons.Docsearch,
    "DocsearchColor" to Lobicons.DocsearchColor,
    "Dolphin" to Lobicons.Dolphin,
    "Doubao" to Lobicons.Doubao,
    "DoubaoColor" to Lobicons.DoubaoColor,
    "Dreammachine" to Lobicons.Dreammachine,
    "Elevenlabs" to Lobicons.Elevenlabs,
    "Elevenx" to Lobicons.Elevenx,
    "Essentialai" to Lobicons.Essentialai,
    "EssentialaiColor" to Lobicons.EssentialaiColor,
    "Exa" to Lobicons.Exa,
    "ExaColor" to Lobicons.ExaColor,
    "Fal" to Lobicons.Fal,
    "FalColor" to Lobicons.FalColor,
    "Fastgpt" to Lobicons.Fastgpt,
    "FastgptColor" to Lobicons.FastgptColor,
    "Featherless" to Lobicons.Featherless,
    "FeatherlessColor" to Lobicons.FeatherlessColor,
    "Figma" to Lobicons.Figma,
    "FigmaColor" to Lobicons.FigmaColor,
    "Fireworks" to Lobicons.Fireworks,
    "FireworksColor" to Lobicons.FireworksColor,
    "Fishaudio" to Lobicons.Fishaudio,
    "Flora" to Lobicons.Flora,
    "Flowith" to Lobicons.Flowith,
    "Flux" to Lobicons.Flux,
    "Friendli" to Lobicons.Friendli,
    "Gemini" to Lobicons.Gemini,
    "Geminicli" to Lobicons.Geminicli,
    "GeminicliColor" to Lobicons.GeminicliColor,
    "GeminiColor" to Lobicons.GeminiColor,
    "Gemma" to Lobicons.Gemma,
    "GemmaColor" to Lobicons.GemmaColor,
    "Giteeai" to Lobicons.Giteeai,
    "Github" to Lobicons.Github,
    "Githubcopilot" to Lobicons.Githubcopilot,
    "Glama" to Lobicons.Glama,
    "Glif" to Lobicons.Glif,
    "Glmv" to Lobicons.Glmv,
    "GlmvColor" to Lobicons.GlmvColor,
    "Google" to Lobicons.Google,
    "Googlecloud" to Lobicons.Googlecloud,
    "GooglecloudColor" to Lobicons.GooglecloudColor,
    "GoogleColor" to Lobicons.GoogleColor,
    "Goose" to Lobicons.Goose,
    "Gradio" to Lobicons.Gradio,
    "GradioColor" to Lobicons.GradioColor,
    "Greptile" to Lobicons.Greptile,
    "GreptileColor" to Lobicons.GreptileColor,
    "Grok" to Lobicons.Grok,
    "Groq" to Lobicons.Groq,
    "Hailuo" to Lobicons.Hailuo,
    "HailuoColor" to Lobicons.HailuoColor,
    "Haiper" to Lobicons.Haiper,
    "Hedra" to Lobicons.Hedra,
    "Higress" to Lobicons.Higress,
    "HigressColor" to Lobicons.HigressColor,
    "Huawei" to Lobicons.Huawei,
    "Huaweicloud" to Lobicons.Huaweicloud,
    "HuaweicloudColor" to Lobicons.HuaweicloudColor,
    "HuaweiColor" to Lobicons.HuaweiColor,
    "Huggingface" to Lobicons.Huggingface,
    "HuggingfaceColor" to Lobicons.HuggingfaceColor,
    "Hunyuan" to Lobicons.Hunyuan,
    "HunyuanColor" to Lobicons.HunyuanColor,
    "Hyperbolic" to Lobicons.Hyperbolic,
    "HyperbolicColor" to Lobicons.HyperbolicColor,
    "Ibm" to Lobicons.Ibm,
    "Ideogram" to Lobicons.Ideogram,
    "Iflytekcloud" to Lobicons.Iflytekcloud,
    "IflytekcloudColor" to Lobicons.IflytekcloudColor,
    "Inception" to Lobicons.Inception,
    "Inference" to Lobicons.Inference,
    "Infermatic" to Lobicons.Infermatic,
    "InfermaticColor" to Lobicons.InfermaticColor,
    "Infinigence" to Lobicons.Infinigence,
    "InfinigenceColor" to Lobicons.InfinigenceColor,
    "Inflection" to Lobicons.Inflection,
    "Internlm" to Lobicons.Internlm,
    "InternlmColor" to Lobicons.InternlmColor,
    "Jimeng" to Lobicons.Jimeng,
    "JimengColor" to Lobicons.JimengColor,
    "Jina" to Lobicons.Jina,
    "Junie" to Lobicons.Junie,
    "JunieColor" to Lobicons.JunieColor,
    "Kilocode" to Lobicons.Kilocode,
    "Kimi" to Lobicons.Kimi,
    "KimiColor" to Lobicons.KimiColor,
    "Kling" to Lobicons.Kling,
    "KlingColor" to Lobicons.KlingColor,
    "Kluster" to Lobicons.Kluster,
    "KlusterColor" to Lobicons.KlusterColor,
    "Kolors" to Lobicons.Kolors,
    "KolorsColor" to Lobicons.KolorsColor,
    "Krea" to Lobicons.Krea,
    "Kwaikat" to Lobicons.Kwaikat,
    "Kwaipilot" to Lobicons.Kwaipilot,
    "KwaipilotColor" to Lobicons.KwaipilotColor,
    "Lambda" to Lobicons.Lambda,
    "Langchain" to Lobicons.Langchain,
    "LangchainColor" to Lobicons.LangchainColor,
    "Langfuse" to Lobicons.Langfuse,
    "LangfuseColor" to Lobicons.LangfuseColor,
    "Langgraph" to Lobicons.Langgraph,
    "LanggraphColor" to Lobicons.LanggraphColor,
    "Langsmith" to Lobicons.Langsmith,
    "LangsmithColor" to Lobicons.LangsmithColor,
    "Leptonai" to Lobicons.Leptonai,
    "LeptonaiColor" to Lobicons.LeptonaiColor,
    "Lg" to Lobicons.Lg,
    "LgColor" to Lobicons.LgColor,
    "Lightricks" to Lobicons.Lightricks,
    "Liquid" to Lobicons.Liquid,
    "Livekit" to Lobicons.Livekit,
    "LivekitColor" to Lobicons.LivekitColor,
    "Llamaindex" to Lobicons.Llamaindex,
    "LlamaindexColor" to Lobicons.LlamaindexColor,
    "Llava" to Lobicons.Llava,
    "LlavaColor" to Lobicons.LlavaColor,
    "Llmapi" to Lobicons.Llmapi,
    "LlmapiColor" to Lobicons.LlmapiColor,
    "Lmstudio" to Lobicons.Lmstudio,
    "Lobehub" to Lobicons.Lobehub,
    "LobehubColor" to Lobicons.LobehubColor,
    "Longcat" to Lobicons.Longcat,
    "LongcatColor" to Lobicons.LongcatColor,
    "Lovable" to Lobicons.Lovable,
    "LovableColor" to Lobicons.LovableColor,
    "Lovart" to Lobicons.Lovart,
    "Luma" to Lobicons.Luma,
    "LumaColor" to Lobicons.LumaColor,
    "Magic" to Lobicons.Magic,
    "Make" to Lobicons.Make,
    "MakeColor" to Lobicons.MakeColor,
    "Manus" to Lobicons.Manus,
    "Mastra" to Lobicons.Mastra,
    "Mcp" to Lobicons.Mcp,
    "Mcpso" to Lobicons.Mcpso,
    "McpsoColor" to Lobicons.McpsoColor,
    "Menlo" to Lobicons.Menlo,
    "Meta" to Lobicons.Meta,
    "Metaai" to Lobicons.Metaai,
    "MetaaiColor" to Lobicons.MetaaiColor,
    "MetaColor" to Lobicons.MetaColor,
    "Metagpt" to Lobicons.Metagpt,
    "Microsoft" to Lobicons.Microsoft,
    "MicrosoftColor" to Lobicons.MicrosoftColor,
    "Midjourney" to Lobicons.Midjourney,
    "Minimax" to Lobicons.Minimax,
    "MinimaxColor" to Lobicons.MinimaxColor,
    "Mistral" to Lobicons.Mistral,
    "MistralColor" to Lobicons.MistralColor,
    "Modelscope" to Lobicons.Modelscope,
    "ModelscopeColor" to Lobicons.ModelscopeColor,
    "Monica" to Lobicons.Monica,
    "MonicaColor" to Lobicons.MonicaColor,
    "Moonshot" to Lobicons.Moonshot,
    "Morph" to Lobicons.Morph,
    "MorphColor" to Lobicons.MorphColor,
    "Myshell" to Lobicons.Myshell,
    "MyshellColor" to Lobicons.MyshellColor,
    "N8n" to Lobicons.N8n,
    "N8nColor" to Lobicons.N8nColor,
    "Nanobanana" to Lobicons.Nanobanana,
    "NanobananaColor" to Lobicons.NanobananaColor,
    "Nebius" to Lobicons.Nebius,
    "Newapi" to Lobicons.Newapi,
    "NewapiColor" to Lobicons.NewapiColor,
    "Notebooklm" to Lobicons.Notebooklm,
    "Notion" to Lobicons.Notion,
    "Nousresearch" to Lobicons.Nousresearch,
    "Nova" to Lobicons.Nova,
    "NovaColor" to Lobicons.NovaColor,
    "Novelai" to Lobicons.Novelai,
    "Novita" to Lobicons.Novita,
    "NovitaColor" to Lobicons.NovitaColor,
    "Nplcloud" to Lobicons.Nplcloud,
    "NplcloudColor" to Lobicons.NplcloudColor,
    "Nvidia" to Lobicons.Nvidia,
    "NvidiaColor" to Lobicons.NvidiaColor,
    "Obsidian" to Lobicons.Obsidian,
    "ObsidianColor" to Lobicons.ObsidianColor,
    "Ollama" to Lobicons.Ollama,
    "Openai" to Lobicons.Openai,
    "Openchat" to Lobicons.Openchat,
    "OpenchatColor" to Lobicons.OpenchatColor,
    "Openclaw" to Lobicons.Openclaw,
    "OpenclawColor" to Lobicons.OpenclawColor,
    "Opencode" to Lobicons.Opencode,
    "Openhands" to Lobicons.Openhands,
    "OpenhandsColor" to Lobicons.OpenhandsColor,
    "Openrouter" to Lobicons.Openrouter,
    "Openwebui" to Lobicons.Openwebui,
    "Palm" to Lobicons.Palm,
    "PalmColor" to Lobicons.PalmColor,
    "Parasail" to Lobicons.Parasail,
    "Perplexity" to Lobicons.Perplexity,
    "PerplexityColor" to Lobicons.PerplexityColor,
    "Phidata" to Lobicons.Phidata,
    "PhidataColor" to Lobicons.PhidataColor,
    "Phind" to Lobicons.Phind,
    "Pika" to Lobicons.Pika,
    "Pixverse" to Lobicons.Pixverse,
    "PixverseColor" to Lobicons.PixverseColor,
    "Player2" to Lobicons.Player2,
    "Player2Color" to Lobicons.Player2Color,
    "Poe" to Lobicons.Poe,
    "PoeColor" to Lobicons.PoeColor,
    "Pollinations" to Lobicons.Pollinations,
    "Ppio" to Lobicons.Ppio,
    "PpioColor" to Lobicons.PpioColor,
    "Prunaai" to Lobicons.Prunaai,
    "PrunaaiColor" to Lobicons.PrunaaiColor,
    "Pydanticai" to Lobicons.Pydanticai,
    "PydanticaiColor" to Lobicons.PydanticaiColor,
    "Qingyan" to Lobicons.Qingyan,
    "QingyanColor" to Lobicons.QingyanColor,
    "Qiniu" to Lobicons.Qiniu,
    "QiniuColor" to Lobicons.QiniuColor,
    "Qoder" to Lobicons.Qoder,
    "QoderColor" to Lobicons.QoderColor,
    "Qwen" to Lobicons.Qwen,
    "QwenColor" to Lobicons.QwenColor,
    "Railway" to Lobicons.Railway,
    "Recraft" to Lobicons.Recraft,
    "Relace" to Lobicons.Relace,
    "Replicate" to Lobicons.Replicate,
    "Replit" to Lobicons.Replit,
    "ReplitColor" to Lobicons.ReplitColor,
    "Reve" to Lobicons.Reve,
    "Roocode" to Lobicons.Roocode,
    "Rsshub" to Lobicons.Rsshub,
    "RsshubColor" to Lobicons.RsshubColor,
    "Runway" to Lobicons.Runway,
    "Rwkv" to Lobicons.Rwkv,
    "RwkvColor" to Lobicons.RwkvColor,
    "Sambanova" to Lobicons.Sambanova,
    "SambanovaColor" to Lobicons.SambanovaColor,
    "Search1api" to Lobicons.Search1api,
    "Search1apiColor" to Lobicons.Search1apiColor,
    "Searchapi" to Lobicons.Searchapi,
    "Sensenova" to Lobicons.Sensenova,
    "SensenovaColor" to Lobicons.SensenovaColor,
    "Siliconcloud" to Lobicons.Siliconcloud,
    "SiliconcloudColor" to Lobicons.SiliconcloudColor,
    "Skywork" to Lobicons.Skywork,
    "SkyworkColor" to Lobicons.SkyworkColor,
    "Smithery" to Lobicons.Smithery,
    "SmitheryColor" to Lobicons.SmitheryColor,
    "Snowflake" to Lobicons.Snowflake,
    "SnowflakeColor" to Lobicons.SnowflakeColor,
    "Sophnet" to Lobicons.Sophnet,
    "SophnetColor" to Lobicons.SophnetColor,
    "Sora" to Lobicons.Sora,
    "SoraColor" to Lobicons.SoraColor,
    "Spark" to Lobicons.Spark,
    "SparkColor" to Lobicons.SparkColor,
    "Stability" to Lobicons.Stability,
    "StabilityColor" to Lobicons.StabilityColor,
    "Statecloud" to Lobicons.Statecloud,
    "StatecloudColor" to Lobicons.StatecloudColor,
    "Stepfun" to Lobicons.Stepfun,
    "StepfunColor" to Lobicons.StepfunColor,
    "Straico" to Lobicons.Straico,
    "StraicoColor" to Lobicons.StraicoColor,
    "Streamlake" to Lobicons.Streamlake,
    "StreamlakeColor" to Lobicons.StreamlakeColor,
    "Submodel" to Lobicons.Submodel,
    "SubmodelColor" to Lobicons.SubmodelColor,
    "Suno" to Lobicons.Suno,
    "Sync" to Lobicons.Sync,
    "Targon" to Lobicons.Targon,
    "TargonColor" to Lobicons.TargonColor,
    "Tavily" to Lobicons.Tavily,
    "TavilyColor" to Lobicons.TavilyColor,
    "Tencent" to Lobicons.Tencent,
    "Tencentcloud" to Lobicons.Tencentcloud,
    "TencentcloudColor" to Lobicons.TencentcloudColor,
    "TencentColor" to Lobicons.TencentColor,
    "Tiangong" to Lobicons.Tiangong,
    "TiangongColor" to Lobicons.TiangongColor,
    "Tii" to Lobicons.Tii,
    "TiiColor" to Lobicons.TiiColor,
    "Together" to Lobicons.Together,
    "TogetherColor" to Lobicons.TogetherColor,
    "Topazlabs" to Lobicons.Topazlabs,
    "Trae" to Lobicons.Trae,
    "TraeColor" to Lobicons.TraeColor,
    "Tripo" to Lobicons.Tripo,
    "TripoColor" to Lobicons.TripoColor,
    "Turix" to Lobicons.Turix,
    "Udio" to Lobicons.Udio,
    "UdioColor" to Lobicons.UdioColor,
    "Unstructured" to Lobicons.Unstructured,
    "UnstructuredColor" to Lobicons.UnstructuredColor,
    "Upstage" to Lobicons.Upstage,
    "UpstageColor" to Lobicons.UpstageColor,
    "V0" to Lobicons.V0,
    "Vectorizerai" to Lobicons.Vectorizerai,
    "Vercel" to Lobicons.Vercel,
    "Vertexai" to Lobicons.Vertexai,
    "VertexaiColor" to Lobicons.VertexaiColor,
    "Vidu" to Lobicons.Vidu,
    "ViduColor" to Lobicons.ViduColor,
    "Viggle" to Lobicons.Viggle,
    "Vllm" to Lobicons.Vllm,
    "VllmColor" to Lobicons.VllmColor,
    "Volcengine" to Lobicons.Volcengine,
    "VolcengineColor" to Lobicons.VolcengineColor,
    "Voyage" to Lobicons.Voyage,
    "VoyageColor" to Lobicons.VoyageColor,
    "Wenxin" to Lobicons.Wenxin,
    "WenxinColor" to Lobicons.WenxinColor,
    "Windsurf" to Lobicons.Windsurf,
    "Workersai" to Lobicons.Workersai,
    "WorkersaiColor" to Lobicons.WorkersaiColor,
    "Xai" to Lobicons.Xai,
    "Xiaomimimo" to Lobicons.Xiaomimimo,
    "Xinference" to Lobicons.Xinference,
    "XinferenceColor" to Lobicons.XinferenceColor,
    "Xpay" to Lobicons.Xpay,
    "XpayColor" to Lobicons.XpayColor,
    "Xuanyuan" to Lobicons.Xuanyuan,
    "XuanyuanColor" to Lobicons.XuanyuanColor,
    "Yandex" to Lobicons.Yandex,
    "Yi" to Lobicons.Yi,
    "YiColor" to Lobicons.YiColor,
    "Youmind" to Lobicons.Youmind,
    "Yuanbao" to Lobicons.Yuanbao,
    "YuanbaoColor" to Lobicons.YuanbaoColor,
    "Zai" to Lobicons.Zai,
    "Zapier" to Lobicons.Zapier,
    "ZapierColor" to Lobicons.ZapierColor,
    "Zeabur" to Lobicons.Zeabur,
    "ZeaburColor" to Lobicons.ZeaburColor,
    "Zencoder" to Lobicons.Zencoder,
    "ZencoderColor" to Lobicons.ZencoderColor,
    "Zenmux" to Lobicons.Zenmux,
    "Zeroone" to Lobicons.Zeroone,
    "Zhipu" to Lobicons.Zhipu,
    "ZhipuColor" to Lobicons.ZhipuColor,
)

enum class FilterTab(val label: String) {
    All("All"),
    Mono("Mono"),
    Color("Color"),
}

fun isMono(name: String) = !name.endsWith("Color")

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Lobicons Preview",
        state = rememberWindowState(width = 1200.dp, height = 800.dp),
    ) {
        MaterialTheme(colorScheme = darkColorScheme()) {
            var search by remember { mutableStateOf("") }
            var selectedTab by remember { mutableStateOf(FilterTab.All) }
            var selected by remember { mutableStateOf<Pair<String, DrawableResource>?>(null) }

            val filtered = allIcons
                .filter { (name, _) ->
                    when (selectedTab) {
                        FilterTab.All -> true
                        FilterTab.Color -> name.endsWith("Color")
                        FilterTab.Mono -> !name.endsWith("Color")
                    }
                }
                .filter { (name, _) ->
                    search.isBlank() || name.contains(search, ignoreCase = true)
                }

            Column(
                Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(16.dp)
            ) {
                // Header row: title + icon count
                Row(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        "Lobicons",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                    )
                    Spacer(Modifier.width(12.dp))
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = MaterialTheme.colorScheme.primaryContainer,
                    ) {
                        Text(
                            "${filtered.size} / ${allIcons.size}",
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                        )
                    }
                }

                // Search field
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    label = { Text("Search icons...") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                    singleLine = true,
                )

                // Filter tabs
                Row(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    FilterTab.entries.forEach { tab ->
                        FilterChip(
                            selected = selectedTab == tab,
                            onClick = { selectedTab = tab },
                            label = { Text(tab.label) },
                        )
                    }
                }

                // Icon grid
                LazyVerticalGrid(
                    columns = GridCells.Adaptive(100.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.weight(1f),
                ) {
                    items(filtered) { (name, res) ->
                        Column(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.surfaceVariant)
                                .clickable { selected = name to res }
                                .padding(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Image(
                                painter = painterResource(res),
                                contentDescription = name,
                                modifier = Modifier.size(32.dp),
                                colorFilter = if (isMono(name)) ColorFilter.tint(Color.White) else null,
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                name,
                                fontSize = 9.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Center,
                            )
                        }
                    }
                }
            }

            // Detail dialog
            selected?.let { (name, res) ->
                Dialog(onDismissRequest = { selected = null }) {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = MaterialTheme.colorScheme.surface,
                        tonalElevation = 8.dp,
                        modifier = Modifier.width(480.dp),
                    ) {
                        Column(
                            modifier = Modifier.padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Text(name, style = MaterialTheme.typography.titleLarge)
                            Spacer(Modifier.height(24.dp))

                            // Size previews: 16, 24, 48, 128
                            Text(
                                "Sizes",
                                style = MaterialTheme.typography.labelMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                            Spacer(Modifier.height(8.dp))
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(32.dp),
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                listOf(16, 24, 48, 128).forEach { size ->
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(
                                            painterResource(res),
                                            name,
                                            Modifier.size(size.dp),
                                            colorFilter = if (isMono(name)) ColorFilter.tint(Color.White) else null,
                                        )
                                        Spacer(Modifier.height(4.dp))
                                        Text(
                                            "${size}dp",
                                            fontSize = 10.sp,
                                            color = Color.Gray,
                                        )
                                    }
                                }
                            }

                            Spacer(Modifier.height(24.dp))

                            // Background previews
                            Text(
                                "Background preview",
                                style = MaterialTheme.typography.labelMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                            Spacer(Modifier.height(8.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Box(
                                        Modifier
                                            .size(128.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(Color.White),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Image(
                                            painterResource(res),
                                            name,
                                            Modifier.size(96.dp),
                                            colorFilter = if (isMono(name)) ColorFilter.tint(Color.Black) else null,
                                        )
                                    }
                                    Spacer(Modifier.height(4.dp))
                                    Text("White", fontSize = 10.sp, color = Color.Gray)
                                }
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Box(
                                        Modifier
                                            .size(128.dp)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(Color.Black),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Image(
                                            painterResource(res),
                                            name,
                                            Modifier.size(96.dp),
                                            colorFilter = if (isMono(name)) ColorFilter.tint(Color.White) else null,
                                        )
                                    }
                                    Spacer(Modifier.height(4.dp))
                                    Text("Black", fontSize = 10.sp, color = Color.Gray)
                                }
                            }

                            Spacer(Modifier.height(20.dp))
                            TextButton(onClick = { selected = null }) {
                                Text("Close")
                            }
                        }
                    }
                }
            }
        }
    }
}
